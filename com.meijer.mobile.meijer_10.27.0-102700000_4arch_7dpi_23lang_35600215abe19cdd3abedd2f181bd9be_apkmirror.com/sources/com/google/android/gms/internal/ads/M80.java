package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class M80 implements K80 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68532a;

    /* renamed from: p, reason: collision with root package name */
    private final int f68547p;

    /* renamed from: b, reason: collision with root package name */
    private long f68533b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f68534c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f68535d = false;

    /* renamed from: q, reason: collision with root package name */
    private int f68548q = 2;

    /* renamed from: r, reason: collision with root package name */
    private int f68549r = 2;

    /* renamed from: e, reason: collision with root package name */
    private int f68536e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f68537f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f68538g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f68539h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f68540i = "";

    /* renamed from: j, reason: collision with root package name */
    private EnumC7548b90 f68541j = EnumC7548b90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: k, reason: collision with root package name */
    private String f68542k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f68543l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f68544m = "";

    /* renamed from: n, reason: collision with root package name */
    private boolean f68545n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f68546o = false;

    public final synchronized M80 A(String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76021J8)).booleanValue()) {
            this.f68544m = str;
        }
        return this;
    }

    public final synchronized M80 B(String str) {
        this.f68539h = str;
        return this;
    }

    public final synchronized M80 C(String str) {
        this.f68540i = str;
        return this;
    }

    public final synchronized M80 D(EnumC7548b90 enumC7548b90) {
        this.f68541j = enumC7548b90;
        return this;
    }

    public final synchronized M80 E(boolean z10) {
        this.f68535d = z10;
        return this;
    }

    public final synchronized M80 F(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76021J8)).booleanValue()) {
            this.f68543l = C7142Rn.h(th2);
            this.f68542k = (String) C7200Tf0.b(AbstractC8981of0.b('\n')).d(C7142Rn.g(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized M80 G() {
        Configuration configuration;
        this.f68536e = Lc.v.u().k(this.f68532a);
        Resources resources = this.f68532a.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f68549r = i10;
        this.f68533b = Lc.v.c().c();
        this.f68546o = true;
        return this;
    }

    public final synchronized M80 f() {
        this.f68534c = Lc.v.c().c();
        return this;
    }

    public final synchronized M80 r(int i10) {
        this.f68548q = i10;
        return this;
    }

    public final synchronized M80 y(Mc.W0 w02) {
        try {
            IBinder iBinder = w02.f19163e;
            if (iBinder != null) {
                SB sb2 = (SB) iBinder;
                String strZzk = sb2.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.f68537f = strZzk;
                }
                String strZzi = sb2.zzi();
                if (!TextUtils.isEmpty(strZzi)) {
                    this.f68538g = strZzi;
                }
            }
        } finally {
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.f68538g = r0.f72024b0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.M80 z(com.google.android.gms.internal.ads.C8394j60 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.c60 r0 = r3.f75337b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f73103b     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.google.android.gms.internal.ads.c60 r0 = r3.f75337b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f73103b     // Catch: java.lang.Throwable -> L12
            r2.f68537f = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.f75336a     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.Z50 r0 = (com.google.android.gms.internal.ads.Z50) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.f72024b0     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.f72024b0     // Catch: java.lang.Throwable -> L12
            r2.f68538g = r3     // Catch: java.lang.Throwable -> L12
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
        return this.f68546o;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final synchronized P80 zzm() {
        try {
            N80 n80 = null;
            if (this.f68545n) {
                return null;
            }
            this.f68545n = true;
            if (!this.f68546o) {
                G();
            }
            if (this.f68534c < 0) {
                f();
            }
            return new P80(this, n80);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.f68539h);
    }

    M80(Context context, int i10) {
        this.f68532a = context;
        this.f68547p = i10;
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
    public final /* bridge */ /* synthetic */ K80 c(EnumC7548b90 enumC7548b90) {
        D(enumC7548b90);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 d(C8394j60 c8394j60) {
        z(c8394j60);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 e(Throwable th2) {
        F(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 i(Mc.W0 w02) {
        y(w02);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 p(String str) {
        A(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K80
    public final /* bridge */ /* synthetic */ K80 r0(boolean z10) {
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
