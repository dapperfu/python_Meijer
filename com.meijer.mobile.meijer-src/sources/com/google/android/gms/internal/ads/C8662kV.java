package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.kV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8662kV implements InterfaceC9541sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final B80 f76492a;

    /* renamed from: b, reason: collision with root package name */
    private final C7678bC f76493b;

    /* renamed from: c, reason: collision with root package name */
    private final L90 f76494c;

    /* renamed from: d, reason: collision with root package name */
    private final R90 f76495d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f76496e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f76497f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6838Ez f76498g;

    /* renamed from: h, reason: collision with root package name */
    private final C8022eV f76499h;

    /* renamed from: i, reason: collision with root package name */
    private final C8981nT f76500i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f76501j;

    /* renamed from: k, reason: collision with root package name */
    private final W80 f76502k;

    /* renamed from: l, reason: collision with root package name */
    private final OU f76503l;

    /* renamed from: m, reason: collision with root package name */
    private final C9296qN f76504m;

    C8662kV(Context context, B80 b80, C8022eV c8022eV, C7678bC c7678bC, L90 l90, R90 r90, InterfaceC6838Ez interfaceC6838Ez, Executor executor, ScheduledExecutorService scheduledExecutorService, C8981nT c8981nT, W80 w80, OU ou2, C9296qN c9296qN) {
        this.f76501j = context;
        this.f76492a = b80;
        this.f76499h = c8022eV;
        this.f76493b = c7678bC;
        this.f76494c = l90;
        this.f76495d = r90;
        this.f76498g = interfaceC6838Ez;
        this.f76496e = executor;
        this.f76497f = scheduledExecutorService;
        this.f76500i = c8981nT;
        this.f76502k = w80;
        this.f76503l = ou2;
        this.f76504m = c9296qN;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String b(com.google.android.gms.internal.ads.C8733l60 r5) {
        /*
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77403w5
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            com.google.android.gms.internal.ads.j60 r2 = r5.f76589b
            com.google.android.gms.internal.ads.c60 r2 = r2.f76177b
            int r2 = r2.f73947f
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8784lf.f77389v5
            com.google.android.gms.internal.ads.jf r3 = Oc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L57
            goto L58
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L58
        L45:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received error HTTP response code: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L58
        L57:
            r1 = r0
        L58:
            com.google.android.gms.internal.ads.j60 r5 = r5.f76589b
            com.google.android.gms.internal.ads.c60 r5 = r5.f76177b
            com.google.android.gms.internal.ads.b60 r5 = r5.f73951j
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.a()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8662kV.b(com.google.android.gms.internal.ads.l60):java.lang.String");
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Z50 z50, C8733l60 c8733l60, InterfaceC8448iT interfaceC8448iT, Throwable th2) throws Exception {
        K80 k80A = J80.a(this.f76501j, 12);
        k80A.L(z50.f72839E);
        k80A.zzi();
        com.google.common.util.concurrent.q qVarO = Mj0.o(interfaceC8448iT.b(c8733l60, z50), z50.f72852R, TimeUnit.MILLISECONDS, this.f76497f);
        this.f76499h.f(c8733l60, z50, qVarO, this.f76494c);
        V80.a(qVarO, this.f76502k, k80A);
        return qVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.q zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8662kV.zza(java.lang.Object):com.google.common.util.concurrent.q");
    }
}
