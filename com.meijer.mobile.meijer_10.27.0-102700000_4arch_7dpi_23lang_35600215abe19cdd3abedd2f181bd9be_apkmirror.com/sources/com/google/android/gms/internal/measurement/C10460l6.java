package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10460l6 extends AbstractC10469m6 {
    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final void a(Object obj, long j10, byte b10) {
        if (C10478n6.f82305h) {
            C10478n6.d(obj, j10, b10);
        } else {
            C10478n6.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final boolean b(Object obj, long j10) {
        return C10478n6.f82305h ? C10478n6.z(obj, j10) : C10478n6.A(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.n6.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.n6.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.measurement.n6.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.measurement.n6.C(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final void c(Object obj, long j10, boolean z10) {
        if (C10478n6.f82305h) {
            C10478n6.B(obj, j10, z10);
        } else {
            C10478n6.C(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f82275a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f82275a.getLong(obj, j10));
    }

    C10460l6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final void e(Object obj, long j10, float f10) {
        this.f82275a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10469m6
    public final void g(Object obj, long j10, double d10) {
        this.f82275a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
