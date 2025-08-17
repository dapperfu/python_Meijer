package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.kV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8537kV implements InterfaceC9416sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final B80 f75652a;

    /* renamed from: b, reason: collision with root package name */
    private final C7553bC f75653b;

    /* renamed from: c, reason: collision with root package name */
    private final L90 f75654c;

    /* renamed from: d, reason: collision with root package name */
    private final R90 f75655d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f75656e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f75657f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6713Ez f75658g;

    /* renamed from: h, reason: collision with root package name */
    private final C7897eV f75659h;

    /* renamed from: i, reason: collision with root package name */
    private final C8856nT f75660i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f75661j;

    /* renamed from: k, reason: collision with root package name */
    private final W80 f75662k;

    /* renamed from: l, reason: collision with root package name */
    private final OU f75663l;

    /* renamed from: m, reason: collision with root package name */
    private final C9171qN f75664m;

    C8537kV(Context context, B80 b80, C7897eV c7897eV, C7553bC c7553bC, L90 l90, R90 r90, InterfaceC6713Ez interfaceC6713Ez, Executor executor, ScheduledExecutorService scheduledExecutorService, C8856nT c8856nT, W80 w80, OU ou2, C9171qN c9171qN) {
        this.f75661j = context;
        this.f75652a = b80;
        this.f75659h = c7897eV;
        this.f75653b = c7553bC;
        this.f75654c = l90;
        this.f75655d = r90;
        this.f75658g = interfaceC6713Ez;
        this.f75656e = executor;
        this.f75657f = scheduledExecutorService;
        this.f75660i = c8856nT;
        this.f75662k = w80;
        this.f75663l = ou2;
        this.f75664m = c9171qN;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String b(com.google.android.gms.internal.ads.C8608l60 r5) {
        /*
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76563w5
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()
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
            com.google.android.gms.internal.ads.j60 r2 = r5.f75749b
            com.google.android.gms.internal.ads.c60 r2 = r2.f75337b
            int r2 = r2.f73107f
            if (r2 == 0) goto L57
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76549v5
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
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
            com.google.android.gms.internal.ads.j60 r5 = r5.f75749b
            com.google.android.gms.internal.ads.c60 r5 = r5.f75337b
            com.google.android.gms.internal.ads.b60 r5 = r5.f73111j
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.a()
            return r5
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8537kV.b(com.google.android.gms.internal.ads.l60):java.lang.String");
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Z50 z50, C8608l60 c8608l60, InterfaceC8323iT interfaceC8323iT, Throwable th2) throws Exception {
        K80 k80A = J80.a(this.f75661j, 12);
        k80A.L(z50.f71999E);
        k80A.zzi();
        com.google.common.util.concurrent.q qVarO = Mj0.o(interfaceC8323iT.b(c8608l60, z50), z50.f72012R, TimeUnit.MILLISECONDS, this.f75657f);
        this.f75659h.f(c8608l60, z50, qVarO, this.f75654c);
        V80.a(qVarO, this.f75662k, k80A);
        return qVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.q zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8537kV.zza(java.lang.Object):com.google.common.util.concurrent.q");
    }
}
