package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class NA implements InterfaceC10118zD, InterfaceC9482tG {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC9212qo f68826a;

    /* renamed from: c, reason: collision with root package name */
    private final Context f68828c;

    /* renamed from: d, reason: collision with root package name */
    private final Z80 f68829d;

    /* renamed from: e, reason: collision with root package name */
    private final Qc.a f68830e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f68831f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f68832g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f68833h = false;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f68827b = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
    }

    final /* synthetic */ void b() {
        C7231Ue.e(this.f68828c);
        this.f68833h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f68827b
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8768mg.f76854j
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8768mg.f76855k
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.Vf r0 = com.google.android.gms.internal.ads.C8768mg.f76853i
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.Aq r0 = Lc.v.s()
            Pc.r0 r0 = r0.j()
            com.google.android.gms.internal.ads.uq r0 = r0.zzg()
            java.lang.String r0 = r0.c()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.f68828c
            com.google.android.gms.internal.ads.Z80 r2 = r5.f68829d
            com.google.android.gms.internal.ads.Tk r3 = Lc.v.j()
            Qc.a r4 = Qc.a.B()
            com.google.android.gms.internal.ads.dl r0 = r3.b(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.f68828c
            com.google.android.gms.internal.ads.Z80 r2 = r5.f68829d
            com.google.android.gms.internal.ads.Tk r3 = Lc.v.j()
            Qc.a r4 = Qc.a.B()
            com.google.android.gms.internal.ads.dl r0 = r3.a(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.Xk r3 = com.google.android.gms.internal.ads.C7498al.f72486b
            com.google.android.gms.internal.ads.Sk r0 = r0.a(r2, r3, r3)
            android.content.Context r2 = r5.f68828c
            Qc.a r3 = r5.f68830e
            com.google.android.gms.internal.ads.so r4 = new com.google.android.gms.internal.ads.so
            r4.<init>(r2, r0, r3)
            r5.f68826a = r4
            r5.f68832g = r1
        La5:
            boolean r0 = r5.f68832g
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.qo r0 = r5.f68826a
            if (r0 == 0) goto Ld3
            com.google.common.util.concurrent.q r0 = r0.a()
            boolean r1 = r5.f68833h
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.Vf r1 = com.google.android.gms.internal.ads.C7914eg.f73922i
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.MA r1 = new com.google.android.gms.internal.ads.MA
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.f68831f
            r0.addListener(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.C7009Nq.a(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.NA.c():void");
    }

    NA(Context context, Z80 z80, Qc.a aVar, Executor executor) {
        this.f68828c = context;
        this.f68829d = z80;
        this.f68830e = aVar;
        this.f68831f = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void a(Vc.N n10) {
        c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void i(String str) {
        c();
    }
}
