package com.google.android.gms.measurement.internal;

/* loaded from: classes6.dex */
final class o6 {

    /* renamed from: a, reason: collision with root package name */
    private final q6 f85739a;

    /* renamed from: b, reason: collision with root package name */
    private int f85740b = 1;

    /* renamed from: c, reason: collision with root package name */
    private long f85741c = d();

    final /* synthetic */ long c() {
        return this.f85741c;
    }

    private final long d() {
        q6 q6Var = this.f85739a;
        com.google.android.gms.common.internal.r.l(q6Var);
        long jLongValue = ((Long) C11120d2.f85504v.b(null)).longValue();
        long jLongValue2 = ((Long) C11120d2.f85506w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f85740b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return q6Var.zzaZ().a() + Math.min(jLongValue, jLongValue2);
    }

    public final void a() {
        this.f85740b++;
        this.f85741c = d();
    }

    public final boolean b() {
        return this.f85739a.zzaZ().a() >= this.f85741c;
    }

    public o6(q6 q6Var) {
        this.f85739a = q6Var;
    }
}
