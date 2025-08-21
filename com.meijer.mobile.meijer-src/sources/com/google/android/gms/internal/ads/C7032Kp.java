package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7032Kp {

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f69009a;

    public final void a(int i10, long j10) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76769D0)).booleanValue()) {
            return;
        }
        if (j10 - this.f69009a.zzf() < 0) {
            Rc.p0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76783E0)).booleanValue()) {
            this.f69009a.w(i10);
            this.f69009a.D(j10);
        } else {
            this.f69009a.w(-1);
            this.f69009a.D(j10);
        }
    }

    C7032Kp(com.google.android.gms.common.util.f fVar, Rc.r0 r0Var, C7436Wp c7436Wp) {
        this.f69009a = r0Var;
    }
}
