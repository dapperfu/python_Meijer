package com.google.android.gms.internal.pal;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class Q1 extends S1 {
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.pal.T1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.pal.T1.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.pal.T1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.pal.T1.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.pal.S1
    public final void c(Object obj, long j10, boolean z10) {
        if (T1.f83724h) {
            T1.n(obj, j10, z10);
        } else {
            T1.o(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.pal.S1
    public final void d(Object obj, long j10, byte b10) {
        if (T1.f83724h) {
            T1.d(obj, j10, b10);
        } else {
            T1.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.pal.S1
    public final boolean g(Object obj, long j10) {
        return T1.f83724h ? T1.y(obj, j10) : T1.z(obj, j10);
    }

    Q1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.pal.S1
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(k(obj, j10));
    }

    @Override // com.google.android.gms.internal.pal.S1
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(j(obj, j10));
    }

    @Override // com.google.android.gms.internal.pal.S1
    public final void e(Object obj, long j10, double d10) {
        o(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.pal.S1
    public final void f(Object obj, long j10, float f10) {
        n(obj, j10, Float.floatToIntBits(f10));
    }
}
