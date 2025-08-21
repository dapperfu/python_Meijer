package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class M80 implements K80 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69372a;

    /* renamed from: p, reason: collision with root package name */
    private final int f69387p;

    /* renamed from: b, reason: collision with root package name */
    private long f69373b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f69374c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f69375d = false;

    /* renamed from: q, reason: collision with root package name */
    private int f69388q = 2;

    /* renamed from: r, reason: collision with root package name */
    private int f69389r = 2;

    /* renamed from: e, reason: collision with root package name */
    private int f69376e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f69377f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f69378g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f69379h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f69380i = "";

    /* renamed from: j, reason: collision with root package name */
    private EnumC7673b90 f69381j = EnumC7673b90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: k, reason: collision with root package name */
    private String f69382k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f69383l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f69384m = "";

    /* renamed from: n, reason: collision with root package name */
    private boolean f69385n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f69386o = false;

    public final synchronized M80 A(String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76861J8)).booleanValue()) {
            this.f69384m = str;
        }
        return this;
    }

    public final synchronized M80 B(String str) {
        this.f69379h = str;
        return this;
    }

    public final synchronized M80 C(String str) {
        this.f69380i = str;
        return this;
    }

    public final synchronized M80 D(EnumC7673b90 enumC7673b90) {
        this.f69381j = enumC7673b90;
        return this;
    }

    public final synchronized M80 E(boolean z10) {
        this.f69375d = z10;
        return this;
    }

    public final synchronized M80 F(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76861J8)).booleanValue()) {
            this.f69383l = C7267Rn.h(th2);
            this.f69382k = (String) C7325Tf0.b(AbstractC9106of0.b('\n')).d(C7267Rn.g(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized M80 G() {
        Configuration configuration;
        this.f69376e = Nc.v.u().k(this.f69372a);
        Resources resources = this.f69372a.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f69389r = i10;
        this.f69373b = Nc.v.c().c();
        this.f69386o = true;
        return this;
    }

    public final synchronized M80 f() {
        this.f69374c = Nc.v.c().c();
        return this;
    }

    public final synchronized M80 r(int i10) {
        this.f69388q = i10;
        return this;
    }

    public final synchronized M80 y(Oc.W0 w02) {
        try {
            IBinder iBinder = w02.f23350e;
            if (iBinder != null) {
                SB sb2 = (SB) iBinder;
                String strZzk = sb2.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.f69377f = strZzk;
                }
                String strZzi = sb2.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.f69378g = strZzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.f69378g = r0.f72864b0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.M80 z(com.google.android.gms.internal.ads.C8519j60 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.c60 r0 = r3.f76177b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f73943b     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.c60 r0 = r3.f76177b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f73943b     // Catch: java.lang.Throwable -> L12
            r2.f69377f = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.f76176a     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.Z50 r0 = (com.google.android.gms.internal.ads.Z50) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.f72864b0     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.f72864b0     // Catch: java.lang.Throwable -> L12
            r2.f69378g = r3     // Catch: java.lang.Throwable -> L12
        L32:
            monitor-exit(r2)
            return r2
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M80.z(com.google.android.gms.internal.ads.j60):com.google.android.gms.internal.ads.M80");
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final synchronized boolean zzk() {
        return this.f69386o;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final synchronized P80 zzm() {
        try {
            N80 n80 = null;
            if (this.f69385n) {
                return null;
            }
            this.f69385n = true;
            if (!this.f69386o) {
                G();
            }
            if (this.f69374c < 0) {
                f();
            }
            return new P80(this, n80);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.f69379h);
    }

    M80(Context context, int i10) {
        this.f69372a = context;
        this.f69387p = i10;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 L(String str) {
        B(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 a(String str) {
        C(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 b(int i10) {
        r(i10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 c(EnumC7673b90 enumC7673b90) {
        D(enumC7673b90);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 d(C8519j60 c8519j60) {
        z(c8519j60);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 e(Throwable th2) {
        F(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 i(Oc.W0 w02) {
        y(w02);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 p(String str) {
        A(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 s0(boolean z10) {
        E(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 zzi() {
        G();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 zzj() {
        f();
        return this;
    }
}
