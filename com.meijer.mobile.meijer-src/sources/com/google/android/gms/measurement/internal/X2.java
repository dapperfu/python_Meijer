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
import com.google.android.gms.internal.measurement.AbstractC10574k4;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import sd.C17067f;

/* loaded from: classes6.dex */
public final class X2 implements C3 {

    /* renamed from: E, reason: collision with root package name */
    private static volatile X2 f86111E;

    /* renamed from: A, reason: collision with root package name */
    private int f86112A;

    /* renamed from: B, reason: collision with root package name */
    private int f86113B;

    /* renamed from: D, reason: collision with root package name */
    final long f86115D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f86116a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86117b;

    /* renamed from: c, reason: collision with root package name */
    private final C11258f f86118c;

    /* renamed from: d, reason: collision with root package name */
    private final C11312m f86119d;

    /* renamed from: e, reason: collision with root package name */
    private final E2 f86120e;

    /* renamed from: f, reason: collision with root package name */
    private final C11343q2 f86121f;

    /* renamed from: g, reason: collision with root package name */
    private final T2 f86122g;

    /* renamed from: h, reason: collision with root package name */
    private final N5 f86123h;

    /* renamed from: i, reason: collision with root package name */
    private final z6 f86124i;

    /* renamed from: j, reason: collision with root package name */
    private final C11293j2 f86125j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f86126k;

    /* renamed from: l, reason: collision with root package name */
    private final M4 f86127l;

    /* renamed from: m, reason: collision with root package name */
    private final C11393x4 f86128m;

    /* renamed from: n, reason: collision with root package name */
    private final C0 f86129n;

    /* renamed from: o, reason: collision with root package name */
    private final B4 f86130o;

    /* renamed from: p, reason: collision with root package name */
    private final String f86131p;

    /* renamed from: q, reason: collision with root package name */
    private C11285i2 f86132q;

    /* renamed from: r, reason: collision with root package name */
    private C11387w5 f86133r;

    /* renamed from: s, reason: collision with root package name */
    private A f86134s;

    /* renamed from: t, reason: collision with root package name */
    private C11269g2 f86135t;

    /* renamed from: u, reason: collision with root package name */
    private D4 f86136u;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f86138w;

    /* renamed from: x, reason: collision with root package name */
    private long f86139x;

    /* renamed from: y, reason: collision with root package name */
    private volatile Boolean f86140y;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f86141z;

    /* renamed from: v, reason: collision with root package name */
    private boolean f86137v = false;

    /* renamed from: C, reason: collision with root package name */
    private final AtomicInteger f86114C = new AtomicInteger(0);

    public final C11293j2 B() {
        return this.f86125j;
    }

    public final boolean E() {
        return this.f86117b;
    }

    public final String F() {
        return this.f86131p;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C11258f c() {
        return this.f86118c;
    }

    final void i() {
        this.f86112A++;
    }

    public final C11312m u() {
        return this.f86119d;
    }

    public final C11343q2 w() {
        C11343q2 c11343q2 = this.f86121f;
        if (c11343q2 == null || !c11343q2.i()) {
            return null;
        }
        return c11343q2;
    }

    final T2 y() {
        return this.f86122g;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final Context zzaY() {
        return this.f86116a;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final com.google.android.gms.common.util.f zzaZ() {
        return this.f86126k;
    }

    public static X2 M(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        Bundle bundle;
        if (h02 != null) {
            Bundle bundle2 = h02.f82617d;
            h02 = new com.google.android.gms.internal.measurement.H0(h02.f82614a, h02.f82615b, h02.f82616c, bundle2, null);
        }
        com.google.android.gms.common.internal.r.l(context);
        com.google.android.gms.common.internal.r.l(context.getApplicationContext());
        if (f86111E == null) {
            synchronized (X2.class) {
                try {
                    if (f86111E == null) {
                        f86111E = new X2(new G3(context, h02, l10));
                    }
                } finally {
                }
            }
        } else if (h02 != null && (bundle = h02.f82617d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.r.l(f86111E);
            f86111E.f86140y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.r.l(f86111E);
        return f86111E;
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

    private static final void r(AbstractC11261f2 abstractC11261f2) {
        if (abstractC11261f2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC11261f2.g()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC11261f2.getClass())));
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
        z6 z6Var = this.f86124i;
        q(z6Var);
        return z6Var;
    }

    public final C11285i2 C() {
        r(this.f86132q);
        return this.f86132q;
    }

    public final B4 D() {
        B4 b42 = this.f86130o;
        s(b42);
        return b42;
    }

    public final M4 G() {
        M4 m42 = this.f86127l;
        r(m42);
        return m42;
    }

    public final C11387w5 H() {
        r(this.f86133r);
        return this.f86133r;
    }

    public final A I() {
        s(this.f86134s);
        return this.f86134s;
    }

    public final C11269g2 J() {
        r(this.f86135t);
        return this.f86135t;
    }

    public final C0 K() {
        C0 c02 = this.f86129n;
        p(c02);
        return c02;
    }

    public final D4 L() {
        p(this.f86136u);
        return this.f86136u;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C11343q2 a() {
        C11343q2 c11343q2 = this.f86121f;
        s(c11343q2);
        return c11343q2;
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final T2 b() {
        T2 t22 = this.f86122g;
        s(t22);
        return t22;
    }

    public final boolean d() {
        return this.f86140y != null && this.f86140y.booleanValue();
    }

    public final int f() {
        T2 t22 = this.f86122g;
        s(t22);
        t22.f();
        C11312m c11312m = this.f86119d;
        if (c11312m.J()) {
            return 1;
        }
        s(t22);
        t22.f();
        if (!this.f86141z) {
            return 8;
        }
        E2 e22 = this.f86120e;
        q(e22);
        Boolean boolR = e22.r();
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 3;
        }
        C11258f c11258f = c11312m.f85708a.f86118c;
        Boolean boolH = c11312m.H("firebase_analytics_collection_enabled");
        return boolH != null ? boolH.booleanValue() ? 0 : 4 : (this.f86140y == null || this.f86140y.booleanValue()) ? 0 : 7;
    }

    public final void g(boolean z10) {
        T2 t22 = this.f86122g;
        s(t22);
        t22.f();
        this.f86141z = z10;
    }

    public final boolean h() {
        T2 t22 = this.f86122g;
        s(t22);
        t22.f();
        return this.f86141z;
    }

    final void j() {
        this.f86114C.incrementAndGet();
    }

    protected final boolean k() {
        if (!this.f86137v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        T2 t22 = this.f86122g;
        s(t22);
        t22.f();
        Boolean bool = this.f86138w;
        if (bool == null || this.f86139x == 0 || (!bool.booleanValue() && Math.abs(this.f86126k.c() - this.f86139x) > 1000)) {
            this.f86139x = this.f86126k.c();
            z6 z6Var = this.f86124i;
            q(z6Var);
            boolean z10 = false;
            if (z6Var.K("android.permission.INTERNET")) {
                q(z6Var);
                if (z6Var.K("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f86116a;
                    if (C17067f.a(context).g() || this.f86119d.k() || (z6.h0(context) && z6.C(context, false))) {
                        z10 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.f86138w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                q(z6Var);
                this.f86138w = Boolean.valueOf(z6Var.m(J().p()));
            }
        }
        return this.f86138w.booleanValue();
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
            C11343q2 c11343q2 = this.f86121f;
            s(c11343q2);
            c11343q2.p().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
        }
        i11 = i10;
        if (th2 == null) {
            E2 e22 = this.f86120e;
            q(e22);
            e22.f85829u.b(true);
            if (bArr == null || bArr.length == 0) {
                C11343q2 c11343q22 = this.f86121f;
                s(c11343q22);
                c11343q22.t().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    C11343q2 c11343q23 = this.f86121f;
                    s(c11343q23);
                    c11343q23.t().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                z6 z6Var = this.f86124i;
                q(z6Var);
                X2 x22 = z6Var.f85708a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = x22.f86116a;
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
                        this.f86128m.r(CameraSettings.FOCUS_STRATEGY_AUTO, "_cmp", bundle);
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
                                Context context2 = z6Var.f85708a.f86116a;
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
                            C11343q2 c11343q24 = z6Var.f85708a.f86121f;
                            s(c11343q24);
                            c11343q24.m().b("Failed to persist Deferred Deep Link. exception", e10);
                            return;
                        }
                    }
                }
                C11343q2 c11343q25 = this.f86121f;
                s(c11343q25);
                c11343q25.p().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e11) {
                C11343q2 c11343q26 = this.f86121f;
                s(c11343q26);
                c11343q26.m().b("Failed to parse the Deferred Deep Link response. exception", e11);
                return;
            }
        }
        C11343q2 c11343q27 = this.f86121f;
        s(c11343q27);
        c11343q27.p().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    final /* synthetic */ void n(G3 g32) {
        T2 t22 = this.f86122g;
        s(t22);
        t22.f();
        C11312m c11312m = this.f86119d;
        c11312m.s();
        A a10 = new A(this);
        a10.k();
        this.f86134s = a10;
        com.google.android.gms.internal.measurement.H0 h02 = g32.f85872d;
        C11269g2 c11269g2 = new C11269g2(this, g32.f85871c, h02 == null ? 0L : h02.f82614a);
        c11269g2.i();
        this.f86135t = c11269g2;
        C11285i2 c11285i2 = new C11285i2(this);
        c11285i2.i();
        this.f86132q = c11285i2;
        C11387w5 c11387w5 = new C11387w5(this);
        c11387w5.i();
        this.f86133r = c11387w5;
        z6 z6Var = this.f86124i;
        z6Var.l();
        this.f86120e.l();
        this.f86135t.j();
        D4 d42 = new D4(this);
        d42.i();
        this.f86136u = d42;
        d42.j();
        C11343q2 c11343q2 = this.f86121f;
        s(c11343q2);
        C11329o2 c11329o2S = c11343q2.s();
        c11312m.y();
        c11329o2S.b("App measurement initialized, version", 133005L);
        s(c11343q2);
        c11343q2.s().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strO = c11269g2.o();
        q(z6Var);
        if (z6Var.N(strO, c11312m.P())) {
            s(c11343q2);
            c11343q2.s().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            s(c11343q2);
            c11343q2.s().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strO)));
        }
        s(c11343q2);
        c11343q2.t().a("Debug-level message logging enabled");
        int i10 = this.f86112A;
        AtomicInteger atomicInteger = this.f86114C;
        if (i10 != atomicInteger.get()) {
            s(c11343q2);
            c11343q2.m().c("Not all components initialized", Integer.valueOf(this.f86112A), Integer.valueOf(atomicInteger.get()));
        }
        this.f86137v = true;
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
        E2 e22 = this.f86120e;
        q(e22);
        return e22;
    }

    public final N5 x() {
        N5 n52 = this.f86123h;
        r(n52);
        return n52;
    }

    public final C11393x4 z() {
        C11393x4 c11393x4 = this.f86128m;
        r(c11393x4);
        return c11393x4;
    }

    X2(G3 g32) throws IllegalStateException {
        long jA;
        com.google.android.gms.common.internal.r.l(g32);
        Context context = g32.f85869a;
        C11258f c11258f = new C11258f(context);
        this.f86118c = c11258f;
        W1.f86102a = c11258f;
        this.f86116a = context;
        this.f86117b = g32.f85873e;
        this.f86140y = g32.f85870b;
        this.f86131p = g32.f85875g;
        this.f86141z = true;
        AbstractC10574k4.b(context);
        com.google.android.gms.common.util.f fVarD = com.google.android.gms.common.util.i.d();
        this.f86126k = fVarD;
        Long l10 = g32.f85874f;
        if (l10 != null) {
            jA = l10.longValue();
        } else {
            jA = fVarD.a();
        }
        this.f86115D = jA;
        this.f86119d = new C11312m(this);
        E2 e22 = new E2(this);
        e22.k();
        this.f86120e = e22;
        C11343q2 c11343q2 = new C11343q2(this);
        c11343q2.k();
        this.f86121f = c11343q2;
        z6 z6Var = new z6(this);
        z6Var.k();
        this.f86124i = z6Var;
        this.f86125j = new C11293j2(new F3(g32, this));
        this.f86129n = new C0(this);
        M4 m42 = new M4(this);
        m42.i();
        this.f86127l = m42;
        C11393x4 c11393x4 = new C11393x4(this);
        c11393x4.i();
        this.f86128m = c11393x4;
        N5 n52 = new N5(this);
        n52.i();
        this.f86123h = n52;
        B4 b42 = new B4(this);
        b42.k();
        this.f86130o = b42;
        T2 t22 = new T2(this);
        t22.k();
        this.f86122g = t22;
        com.google.android.gms.internal.measurement.H0 h02 = g32.f85872d;
        boolean z10 = h02 == null || h02.f82615b == 0;
        if (context.getApplicationContext() instanceof Application) {
            r(c11393x4);
            if (c11393x4.f85708a.f86116a.getApplicationContext() instanceof Application) {
                Application application = (Application) c11393x4.f85708a.f86116a.getApplicationContext();
                if (c11393x4.f86846c == null) {
                    c11393x4.f86846c = new C11310l4(c11393x4);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(c11393x4.f86846c);
                    application.registerActivityLifecycleCallbacks(c11393x4.f86846c);
                    C11343q2 c11343q22 = c11393x4.f85708a.f86121f;
                    s(c11343q22);
                    c11343q22.u().a("Registered activity lifecycle callback");
                }
            }
        } else {
            s(c11343q2);
            c11343q2.p().a("Application context is not an Application");
        }
        t22.r(new V2(this, g32));
    }

    final void N(boolean z10) {
        this.f86140y = Boolean.valueOf(z10);
    }

    public final boolean e() {
        if (f() == 0) {
            return true;
        }
        return false;
    }
}
