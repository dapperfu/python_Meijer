package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Y00 implements T10 {

    /* renamed from: d, reason: collision with root package name */
    private static String f72292d;

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f72293a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f72294b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f72295c;

    public Y00(Xj0 xj0, Context context, Set set) {
        this.f72293a = xj0;
        this.f72294b = context;
        this.f72295c = set;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 27;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C7550a10 a() throws java.lang.Exception {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77123c5
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77277n5
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.f72295c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L80
        L46:
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77291o5
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            java.lang.String r0 = com.google.android.gms.internal.ads.Y00.f72292d
            if (r0 != 0) goto L68
            android.content.Context r0 = r3.f72294b
            com.google.android.gms.internal.ads.YS r1 = Nc.v.b()
            java.lang.String r0 = r1.zzf(r0)
            com.google.android.gms.internal.ads.Y00.f72292d = r0
        L68:
            com.google.android.gms.internal.ads.a10 r0 = new com.google.android.gms.internal.ads.a10
            java.lang.String r1 = com.google.android.gms.internal.ads.Y00.f72292d
            r0.<init>(r1)
            return r0
        L70:
            android.content.Context r0 = r3.f72294b
            com.google.android.gms.internal.ads.a10 r1 = new com.google.android.gms.internal.ads.a10
            com.google.android.gms.internal.ads.YS r2 = Nc.v.b()
            java.lang.String r0 = r2.zzf(r0)
            r1.<init>(r0)
            return r1
        L80:
            com.google.android.gms.internal.ads.a10 r0 = new com.google.android.gms.internal.ads.a10
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Y00.a():com.google.android.gms.internal.ads.a10");
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f72293a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.X00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f72071a.a();
            }
        });
    }
}
