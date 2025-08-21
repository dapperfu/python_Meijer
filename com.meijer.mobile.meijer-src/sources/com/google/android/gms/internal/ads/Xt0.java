package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Xt0 extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f72266f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private int f72269c;

    /* renamed from: e, reason: collision with root package name */
    private int f72271e;

    /* renamed from: a, reason: collision with root package name */
    private final int f72267a = 128;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f72268b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private byte[] f72270d = new byte[128];

    public final synchronized int a() {
        return this.f72269c + this.f72271e;
    }

    public final synchronized Zt0 b() {
        try {
            int i10 = this.f72271e;
            byte[] bArr = this.f72270d;
            if (i10 >= bArr.length) {
                this.f72268b.add(new Wt0(this.f72270d));
                this.f72270d = f72266f;
            } else if (i10 > 0) {
                this.f72268b.add(new Wt0(Arrays.copyOf(bArr, i10)));
            }
            this.f72269c += this.f72271e;
            this.f72271e = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return Zt0.y(this.f72268b);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f72271e == this.f72270d.length) {
                c(1);
            }
            byte[] bArr = this.f72270d;
            int i11 = this.f72271e;
            this.f72271e = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void c(int i10) {
        this.f72268b.add(new Wt0(this.f72270d));
        int length = this.f72269c + this.f72270d.length;
        this.f72269c = length;
        this.f72270d = new byte[Math.max(this.f72267a, Math.max(i10, length >>> 1))];
        this.f72271e = 0;
    }

    Xt0(int i10) {
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f72270d;
        int length = bArr2.length;
        int i12 = this.f72271e;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f72271e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        c(i14);
        System.arraycopy(bArr, i10 + i13, this.f72270d, 0, i14);
        this.f72271e = i14;
    }
}
