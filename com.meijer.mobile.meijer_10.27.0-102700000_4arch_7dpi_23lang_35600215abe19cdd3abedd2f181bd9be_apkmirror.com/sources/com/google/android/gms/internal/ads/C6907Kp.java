package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6907Kp {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f68169a;

    public final void a(int i10, long j10) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75929D0)).booleanValue()) {
            return;
        }
        if (j10 - this.f68169a.zzf() < 0) {
            Pc.p0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f75943E0)).booleanValue()) {
            this.f68169a.w(i10);
            this.f68169a.D(j10);
        } else {
            this.f68169a.w(-1);
            this.f68169a.D(j10);
        }
    }

    C6907Kp(com.google.android.gms.common.util.f fVar, Pc.r0 r0Var, C7311Wp c7311Wp) {
        this.f68169a = r0Var;
    }
}
