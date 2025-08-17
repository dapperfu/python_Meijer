package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC10449k4;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import qd.C16519f;

/* loaded from: classes6.dex */
public final class X2 implements C3 {

    /* renamed from: E, reason: collision with root package name */
    private static volatile X2 f85271E;

    /* renamed from: A, reason: collision with root package name */
    private int f85272A;

    /* renamed from: B, reason: collision with root package name */
    private int f85273B;

    /* renamed from: D, reason: collision with root package name */
    final long f85275D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f85276a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f85277b;

    /* renamed from: c, reason: collision with root package name */
    private final C11133f f85278c;

    /* renamed from: d, reason: collision with root package name */
    private final C11187m f85279d;

    /* renamed from: e, reason: collision with root package name */
    private final E2 f85280e;

    /* renamed from: f, reason: collision with root package name */
    private final C11218q2 f85281f;

    /* renamed from: g, reason: collision with root package name */
    private final T2 f85282g;

    /* renamed from: h, reason: collision with root package name */
    private final N5 f85283h;

    /* renamed from: i, reason: collision with root package name */
    private final z6 f85284i;

    /* renamed from: j, reason: collision with root package name */
    private final C11168j2 f85285j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f85286k;

    /* renamed from: l, reason: collision with root package name */
    private final M4 f85287l;

    /* renamed from: m, reason: collision with root package name */
    private final C11268x4 f85288m;

    /* renamed from: n, reason: collision with root package name */
    private final C0 f85289n;

    /* renamed from: o, reason: collision with root package name */
    private final B4 f85290o;

    /* renamed from: p, reason: collision with root package name */
    private final String f85291p;

    /* renamed from: q, reason: collision with root package name */
    private C11160i2 f85292q;

    /* renamed from: r, reason: collision with root package name */
    private C11262w5 f85293r;

    /* renamed from: s, reason: collision with root package name */
    private A f85294s;

    /* renamed from: t, reason: collision with root package name */
    private C11144g2 f85295t;

    /* renamed from: u, reason: collision with root package name */
    private D4 f85296u;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f85298w;

    /* renamed from: x, reason: collision with root package name */
    private long f85299x;

    /* renamed from: y, reason: collision with root package name */
    private volatile Boolean f85300y;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f85301z;

    /* renamed from: v, reason: collision with root package name */
    private boolean f85297v = false;

    /* renamed from: C, reason: collision with root package name */
    private final AtomicInteger f85274C = new AtomicInteger(0);

    public final C11168j2 B() {
        return this.f85285j;
    }

    public final boolean E() {
        return this.f85277b;
    }

    public final String F() {
        return this.f85291p;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C11133f c() {
        return this.f85278c;
    }

    final void i() {
        this.f85272A++;
    }

    public final C11187m u() {
        return this.f85279d;
    }

    public final C11218q2 w() {
        C11218q2 c11218q2 = this.f85281f;
        if (c11218q2 == null || !c11218q2.i()) {
            return null;
        }
        return c11218q2;
    }

    final T2 y() {
        return this.f85282g;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final Context zzaY() {
        return this.f85276a;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final com.google.android.gms.common.util.f zzaZ() {
        return this.f85286k;
    }

    public static X2 M(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        Bundle bundle;
        if (h02 != null) {
            Bundle bundle2 = h02.f81777d;
            h02 = new com.google.android.gms.internal.measurement.H0(h02.f81774a, h02.f81775b, h02.f81776c, bundle2, null);
        }
        com.google.android.gms.common.internal.r.l(context);
        com.google.android.gms.common.internal.r.l(context.getApplicationContext());
        if (f85271E == null) {
            synchronized (X2.class) {
                try {
                    if (f85271E == null) {
                        f85271E = new X2(new G3(context, h02, l10));
                    }
                } finally {
                }
            }
        } else if (h02 != null && (bundle = h02.f81777d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.r.l(f85271E);
            f85271E.f85300y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.r.l(f85271E);
        return f85271E;
    }

    static final void o() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void p(E1 e12) {
        if (e12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void q(A3 a32) {
        if (a32 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void r(AbstractC11136f2 abstractC11136f2) {
        if (abstractC11136f2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC11136f2.g()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC11136f2.getClass())));
        }
    }

    private static final void s(B3 b32) {
        if (b32 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!b32.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b32.getClass())));
        }
    }

    public final z6 A() {
        z6 z6Var = this.f85284i;
        q(z6Var);
        return z6Var;
    }

    public final C11160i2 C() {
        r(this.f85292q);
        return this.f85292q;
    }

    public final B4 D() {
        B4 b42 = this.f85290o;
        s(b42);
        return b42;
    }

    public final M4 G() {
        M4 m42 = this.f85287l;
        r(m42);
        return m42;
    }

    public final C11262w5 H() {
        r(this.f85293r);
        return this.f85293r;
    }

    public final A I() {
        s(this.f85294s);
        return this.f85294s;
    }

    public final C11144g2 J() {
        r(this.f85295t);
        return this.f85295t;
    }

    public final C0 K() {
        C0 c02 = this.f85289n;
        p(c02);
        return c02;
    }

    public final D4 L() {
        p(this.f85296u);
        return this.f85296u;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C11218q2 a() {
        C11218q2 c11218q2 = this.f85281f;
        s(c11218q2);
        return c11218q2;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final T2 b() {
        T2 t22 = this.f85282g;
        s(t22);
        return t22;
    }

    public final boolean d() {
        return this.f85300y != null && this.f85300y.booleanValue();
    }

    public final int f() {
        T2 t22 = this.f85282g;
        s(t22);
        t22.f();
        C11187m c11187m = this.f85279d;
        if (c11187m.J()) {
            return 1;
        }
        s(t22);
        t22.f();
        if (!this.f85301z) {
            return 8;
        }
        E2 e22 = this.f85280e;
        q(e22);
        Boolean boolR = e22.r();
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 3;
        }
        C11133f c11133f = c11187m.f84868a.f85278c;
        Boolean boolH = c11187m.H("firebase_analytics_collection_enabled");
        return boolH != null ? boolH.booleanValue() ? 0 : 4 : (this.f85300y == null || this.f85300y.booleanValue()) ? 0 : 7;
    }

    public final void g(boolean z10) {
        T2 t22 = this.f85282g;
        s(t22);
        t22.f();
        this.f85301z = z10;
    }

    public final boolean h() {
        T2 t22 = this.f85282g;
        s(t22);
        t22.f();
        return this.f85301z;
    }

    final void j() {
        this.f85274C.incrementAndGet();
    }

    protected final boolean k() {
        if (!this.f85297v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        T2 t22 = this.f85282g;
        s(t22);
        t22.f();
        Boolean bool = this.f85298w;
        if (bool == null || this.f85299x == 0 || (!bool.booleanValue() && Math.abs(this.f85286k.c() - this.f85299x) > 1000)) {
            this.f85299x = this.f85286k.c();
            z6 z6Var = this.f85284i;
            q(z6Var);
            boolean z10 = false;
            if (z6Var.K("android.permission.INTERNET")) {
                q(z6Var);
                if (z6Var.K("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f85276a;
                    if (C16519f.a(context).g() || this.f85279d.k() || (z6.h0(context) && z6.C(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f85298w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                q(z6Var);
                this.f85298w = Boolean.valueOf(z6Var.m(J().p()));
            }
        }
        return this.f85298w.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X2.l():boolean");
    }

    final /* synthetic */ void m(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        int i11;
        if (i10 != 200 && i10 != 204) {
            i11 = HttpResponseStatus.REDIRECTION_NOT_MODIFIED;
            if (i10 != 304) {
                i11 = i10;
            }
            C11218q2 c11218q2 = this.f85281f;
            s(c11218q2);
            c11218q2.p().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            E2 e22 = this.f85280e;
            q(e22);
            e22.f84989u.b(true);
            if (bArr == null || bArr.length == 0) {
                C11218q2 c11218q22 = this.f85281f;
                s(c11218q22);
                c11218q22.t().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    C11218q2 c11218q23 = this.f85281f;
                    s(c11218q23);
                    c11218q23.t().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                z6 z6Var = this.f85284i;
                q(z6Var);
                X2 x22 = z6Var.f84868a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = x22.f85276a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.f85288m.r(CameraSettings.FOCUS_STRATEGY_AUTO, "_cmp", bundle);
                        q(z6Var);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = z6Var.f84868a.f85276a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e10) {
                            C11218q2 c11218q24 = z6Var.f84868a.f85281f;
                            s(c11218q24);
                            c11218q24.m().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C11218q2 c11218q25 = this.f85281f;
                s(c11218q25);
                c11218q25.p().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                C11218q2 c11218q26 = this.f85281f;
                s(c11218q26);
                c11218q26.m().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C11218q2 c11218q27 = this.f85281f;
        s(c11218q27);
        c11218q27.p().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    final /* synthetic */ void n(G3 g32) {
        T2 t22 = this.f85282g;
        s(t22);
        t22.f();
        C11187m c11187m = this.f85279d;
        c11187m.s();
        A a10 = new A(this);
        a10.k();
        this.f85294s = a10;
        com.google.android.gms.internal.measurement.H0 h02 = g32.f85032d;
        C11144g2 c11144g2 = new C11144g2(this, g32.f85031c, h02 == null ? 0L : h02.f81774a);
        c11144g2.i();
        this.f85295t = c11144g2;
        C11160i2 c11160i2 = new C11160i2(this);
        c11160i2.i();
        this.f85292q = c11160i2;
        C11262w5 c11262w5 = new C11262w5(this);
        c11262w5.i();
        this.f85293r = c11262w5;
        z6 z6Var = this.f85284i;
        z6Var.l();
        this.f85280e.l();
        this.f85295t.j();
        D4 d42 = new D4(this);
        d42.i();
        this.f85296u = d42;
        d42.j();
        C11218q2 c11218q2 = this.f85281f;
        s(c11218q2);
        C11204o2 c11204o2S = c11218q2.s();
        c11187m.y();
        c11204o2S.b("App measurement initialized, version", 133005L);
        s(c11218q2);
        c11218q2.s().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strO = c11144g2.o();
        q(z6Var);
        if (z6Var.N(strO, c11187m.P())) {
            s(c11218q2);
            c11218q2.s().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            s(c11218q2);
            c11218q2.s().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strO)));
        }
        s(c11218q2);
        c11218q2.t().a("Debug-level message logging enabled");
        int i10 = this.f85272A;
        AtomicInteger atomicInteger = this.f85274C;
        if (i10 != atomicInteger.get()) {
            s(c11218q2);
            c11218q2.m().c("Not all components initialized", Integer.valueOf(this.f85272A), Integer.valueOf(atomicInteger.get()));
        }
        this.f85297v = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void t(com.google.android.gms.internal.measurement.H0 r14) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X2.t(com.google.android.gms.internal.measurement.H0):void");
    }

    public final E2 v() {
        E2 e22 = this.f85280e;
        q(e22);
        return e22;
    }

    public final N5 x() {
        N5 n52 = this.f85283h;
        r(n52);
        return n52;
    }

    public final C11268x4 z() {
        C11268x4 c11268x4 = this.f85288m;
        r(c11268x4);
        return c11268x4;
    }

    X2(G3 g32) throws IllegalStateException {
        long jA;
        com.google.android.gms.common.internal.r.l(g32);
        Context context = g32.f85029a;
        C11133f c11133f = new C11133f(context);
        this.f85278c = c11133f;
        W1.f85262a = c11133f;
        this.f85276a = context;
        this.f85277b = g32.f85033e;
        this.f85300y = g32.f85030b;
        this.f85291p = g32.f85035g;
        this.f85301z = true;
        AbstractC10449k4.b(context);
        com.google.android.gms.common.util.f fVarD = com.google.android.gms.common.util.i.d();
        this.f85286k = fVarD;
        Long l10 = g32.f85034f;
        if (l10 != null) {
            jA = l10.longValue();
        } else {
            jA = fVarD.a();
        }
        this.f85275D = jA;
        this.f85279d = new C11187m(this);
        E2 e22 = new E2(this);
        e22.k();
        this.f85280e = e22;
        C11218q2 c11218q2 = new C11218q2(this);
        c11218q2.k();
        this.f85281f = c11218q2;
        z6 z6Var = new z6(this);
        z6Var.k();
        this.f85284i = z6Var;
        this.f85285j = new C11168j2(new F3(g32, this));
        this.f85289n = new C0(this);
        M4 m42 = new M4(this);
        m42.i();
        this.f85287l = m42;
        C11268x4 c11268x4 = new C11268x4(this);
        c11268x4.i();
        this.f85288m = c11268x4;
        N5 n52 = new N5(this);
        n52.i();
        this.f85283h = n52;
        B4 b42 = new B4(this);
        b42.k();
        this.f85290o = b42;
        T2 t22 = new T2(this);
        t22.k();
        this.f85282g = t22;
        com.google.android.gms.internal.measurement.H0 h02 = g32.f85032d;
        boolean z10 = h02 == null || h02.f81775b == 0;
        if (context.getApplicationContext() instanceof Application) {
            r(c11268x4);
            if (c11268x4.f84868a.f85276a.getApplicationContext() instanceof Application) {
                Application application = (Application) c11268x4.f84868a.f85276a.getApplicationContext();
                if (c11268x4.f86006c == null) {
                    c11268x4.f86006c = new C11185l4(c11268x4);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(c11268x4.f86006c);
                    application.registerActivityLifecycleCallbacks(c11268x4.f86006c);
                    C11218q2 c11218q22 = c11268x4.f84868a.f85281f;
                    s(c11218q22);
                    c11218q22.u().a("Registered activity lifecycle callback");
                }
            }
        } else {
            s(c11218q2);
            c11218q2.p().a("Application context is not an Application");
        }
        t22.r(new V2(this, g32));
    }

    final void N(boolean z10) {
        this.f85300y = Boolean.valueOf(z10);
    }

    public final boolean e() {
        if (f() == 0) {
            return true;
        }
        return false;
    }
}
