package com.google.android.gms.internal.ads;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.ui0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9753ui0 extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private long f79733a;

    /* renamed from: b, reason: collision with root package name */
    private long f79734b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f79734b = this.f79733a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f79733a == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f79733a--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f79734b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f79733a = this.f79734b;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f79733a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f79733a;
        if (j10 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (i12 != -1) {
            this.f79733a -= i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f79733a));
        this.f79733a -= jSkip;
        return jSkip;
    }

    C9753ui0(InputStream inputStream, long j10) {
        boolean z10;
        super(inputStream);
        this.f79734b = -1L;
        inputStream.getClass();
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C6782Df0.f(z10, "limit must be non-negative");
        this.f79733a = j10;
    }
}
