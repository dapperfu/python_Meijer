package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class N5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f68806a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68807b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68808c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f68809d;

    /* renamed from: e, reason: collision with root package name */
    public int f68810e;

    public final void b() {
        this.f68807b = false;
        this.f68808c = false;
    }

    public final boolean d(int i10) {
        if (!this.f68807b) {
            return false;
        }
        this.f68810e -= i10;
        this.f68807b = false;
        this.f68808c = true;
        return true;
    }

    public final boolean e() {
        return this.f68808c;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f68807b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f68809d;
            int length = bArr2.length;
            int i13 = this.f68810e + i12;
            if (length < i13) {
                this.f68809d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f68809d, this.f68810e, i12);
            this.f68810e += i12;
        }
    }

    public final void c(int i10) {
        C8086gC.f(!this.f68807b);
        boolean z10 = i10 == this.f68806a;
        this.f68807b = z10;
        if (z10) {
            this.f68810e = 3;
            this.f68808c = false;
        }
    }

    public N5(int i10, int i11) {
        this.f68806a = i10;
        byte[] bArr = new byte[131];
        this.f68809d = bArr;
        bArr[2] = 1;
    }
}
