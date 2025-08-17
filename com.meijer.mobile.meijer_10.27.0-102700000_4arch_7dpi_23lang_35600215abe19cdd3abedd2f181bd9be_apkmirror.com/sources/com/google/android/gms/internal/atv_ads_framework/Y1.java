package com.google.android.gms.internal.atv_ads_framework;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class Y1 extends Z1 {
    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f80944a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f80944a.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.atv_ads_framework.a2.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.atv_ads_framework.a2.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.atv_ads_framework.a2.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.atv_ads_framework.a2.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final void c(Object obj, long j10, boolean z10) {
        if (C10201a2.f80964h) {
            C10201a2.n(obj, j10, z10);
        } else {
            C10201a2.o(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final void d(Object obj, long j10, byte b10) {
        if (C10201a2.f80964h) {
            C10201a2.d(obj, j10, b10);
        } else {
            C10201a2.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final boolean g(Object obj, long j10) {
        return C10201a2.f80964h ? C10201a2.y(obj, j10) : C10201a2.z(obj, j10);
    }

    Y1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final void e(Object obj, long j10, double d10) {
        this.f80944a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.Z1
    public final void f(Object obj, long j10, float f10) {
        this.f80944a.putInt(obj, j10, Float.floatToIntBits(f10));
    }
}
