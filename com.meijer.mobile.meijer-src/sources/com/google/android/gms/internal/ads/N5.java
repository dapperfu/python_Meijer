package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class N5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f69646a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f69647b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f69648c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f69649d;

    /* renamed from: e, reason: collision with root package name */
    public int f69650e;

    public final void b() {
        this.f69647b = false;
        this.f69648c = false;
    }

    public final boolean d(int i10) {
        if (!this.f69647b) {
            return false;
        }
        this.f69650e -= i10;
        this.f69647b = false;
        this.f69648c = true;
        return true;
    }

    public final boolean e() {
        return this.f69648c;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f69647b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f69649d;
            int length = bArr2.length;
            int i13 = this.f69650e + i12;
            if (length < i13) {
                this.f69649d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f69649d, this.f69650e, i12);
            this.f69650e += i12;
        }
    }

    public final void c(int i10) {
        C8211gC.f(!this.f69647b);
        boolean z10 = i10 == this.f69646a;
        this.f69647b = z10;
        if (z10) {
            this.f69650e = 3;
            this.f69648c = false;
        }
    }

    public N5(int i10, int i11) {
        this.f69646a = i10;
        byte[] bArr = new byte[131];
        this.f69649d = bArr;
        bArr[2] = 1;
    }
}
