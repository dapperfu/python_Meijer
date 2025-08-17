package Xf;

import Vf.g;
import ag.l;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f39314a;

    /* renamed from: b, reason: collision with root package name */
    private final l f39315b;

    /* renamed from: c, reason: collision with root package name */
    g f39316c;

    /* renamed from: d, reason: collision with root package name */
    long f39317d = -1;

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f39314a.write(i10);
            long j10 = this.f39317d + 1;
            this.f39317d = j10;
            this.f39316c.o(j10);
        } catch (IOException e10) {
            this.f39316c.v(this.f39315b.c());
            d.d(this.f39316c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f39317d;
        if (j10 != -1) {
            this.f39316c.o(j10);
        }
        this.f39316c.t(this.f39315b.c());
        try {
            this.f39314a.close();
        } catch (IOException e10) {
            this.f39316c.v(this.f39315b.c());
            d.d(this.f39316c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f39314a.flush();
        } catch (IOException e10) {
            this.f39316c.v(this.f39315b.c());
            d.d(this.f39316c);
            throw e10;
        }
    }

    public b(OutputStream outputStream, g gVar, l lVar) {
        this.f39314a = outputStream;
        this.f39316c = gVar;
        this.f39315b = lVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f39314a.write(bArr);
            long length = this.f39317d + bArr.length;
            this.f39317d = length;
            this.f39316c.o(length);
        } catch (IOException e10) {
            this.f39316c.v(this.f39315b.c());
            d.d(this.f39316c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f39314a.write(bArr, i10, i11);
            long j10 = this.f39317d + i11;
            this.f39317d = j10;
            this.f39316c.o(j10);
        } catch (IOException e10) {
            this.f39316c.v(this.f39315b.c());
            d.d(this.f39316c);
            throw e10;
        }
    }
}
