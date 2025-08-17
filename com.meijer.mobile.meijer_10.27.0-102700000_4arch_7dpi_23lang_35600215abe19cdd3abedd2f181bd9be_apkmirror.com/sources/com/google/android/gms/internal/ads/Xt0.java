package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Xt0 extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f71426f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    private int f71429c;

    /* renamed from: e, reason: collision with root package name */
    private int f71431e;

    /* renamed from: a, reason: collision with root package name */
    private final int f71427a = 128;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f71428b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private byte[] f71430d = new byte[128];

    public final synchronized int a() {
        return this.f71429c + this.f71431e;
    }

    public final synchronized Zt0 b() {
        try {
            int i10 = this.f71431e;
            byte[] bArr = this.f71430d;
            if (i10 >= bArr.length) {
                this.f71428b.add(new Wt0(this.f71430d));
                this.f71430d = f71426f;
            } else if (i10 > 0) {
                this.f71428b.add(new Wt0(Arrays.copyOf(bArr, i10)));
            }
            this.f71429c += this.f71431e;
            this.f71431e = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return Zt0.y(this.f71428b);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f71431e == this.f71430d.length) {
                c(1);
            }
            byte[] bArr = this.f71430d;
            int i11 = this.f71431e;
            this.f71431e = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void c(int i10) {
        this.f71428b.add(new Wt0(this.f71430d));
        int length = this.f71429c + this.f71430d.length;
        this.f71429c = length;
        this.f71430d = new byte[Math.max(this.f71427a, Math.max(i10, length >>> 1))];
        this.f71431e = 0;
    }

    Xt0(int i10) {
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f71430d;
        int length = bArr2.length;
        int i12 = this.f71431e;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f71431e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        c(i14);
        System.arraycopy(bArr, i10 + i13, this.f71430d, 0, i14);
        this.f71431e = i14;
    }
}
