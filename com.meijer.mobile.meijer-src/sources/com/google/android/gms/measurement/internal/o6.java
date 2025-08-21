package com.google.android.gms.measurement.internal;

/* loaded from: classes6.dex */
final class o6 {

    /* renamed from: a, reason: collision with root package name */
    private final q6 f86579a;

    /* renamed from: b, reason: collision with root package name */
    private int f86580b = 1;

    /* renamed from: c, reason: collision with root package name */
    private long f86581c = d();

    final /* synthetic */ long c() {
        return this.f86581c;
    }

    private final long d() {
        q6 q6Var = this.f86579a;
        com.google.android.gms.common.internal.r.l(q6Var);
        long jLongValue = ((Long) C11245d2.f86344v.b(null)).longValue();
        long jLongValue2 = ((Long) C11245d2.f86346w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f86580b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return q6Var.zzaZ().a() + Math.min(jLongValue, jLongValue2);
    }

    public final void a() {
        this.f86580b++;
        this.f86581c = d();
    }

    public final boolean b() {
        return this.f86579a.zzaZ().a() >= this.f86581c;
    }

    public o6(q6 q6Var) {
        this.f86579a = q6Var;
    }
}
