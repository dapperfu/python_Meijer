package com.bumptech.glide.load.data;

import fsimpl.C14045dq;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class g extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f63772c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f63773d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63774e;

    /* renamed from: a, reason: collision with root package name */
    private final byte f63775a;

    /* renamed from: b, reason: collision with root package name */
    private int f63776b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11 = this.f63776b;
        int i12 = (i11 < 2 || i11 > (i10 = f63774e)) ? super.read() : i11 == i10 ? this.f63775a : f63772c[i11 - 2] & 255;
        if (i12 != -1) {
            this.f63776b++;
        }
        return i12;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, C14045dq.OVERLAY, 0, 2, 0, 0, 0, 1, 0};
        f63772c = bArr;
        int length = bArr.length;
        f63773d = length;
        f63774e = length + 2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f63775a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f63776b = (int) (this.f63776b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f63776b;
        int i14 = f63774e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f63775a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f63772c, this.f63776b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f63776b += i12;
        }
        return i12;
    }
}
