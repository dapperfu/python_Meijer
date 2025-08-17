package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class Yv0 extends AbstractC7521aw0 {
    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final byte a(long j10) {
        return Memory.peekByte((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final void d(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray((int) j10, bArr, (int) j11, (int) j12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final double b(Object obj, long j10) {
        return Double.longBitsToDouble(this.f72687a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final float c(Object obj, long j10) {
        return Float.intBitsToFloat(this.f72687a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final void e(Object obj, long j10, boolean z10) {
        if (C7628bw0.f73028i) {
            C7628bw0.g(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            C7628bw0.h(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final void f(Object obj, long j10, byte b10) {
        if (C7628bw0.f73028i) {
            C7628bw0.g(obj, j10, b10);
        } else {
            C7628bw0.h(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final boolean i(Object obj, long j10) {
        return C7628bw0.f73028i ? C7628bw0.E(obj, j10) : C7628bw0.F(obj, j10);
    }

    Yv0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final void g(Object obj, long j10, double d10) {
        this.f72687a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7521aw0
    public final void h(Object obj, long j10, float f10) {
        this.f72687a.putInt(obj, j10, Float.floatToIntBits(f10));
    }
}
