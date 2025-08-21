package Zf;

import Xf.g;
import cg.l;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f43792a;

    /* renamed from: b, reason: collision with root package name */
    private final l f43793b;

    /* renamed from: c, reason: collision with root package name */
    g f43794c;

    /* renamed from: d, reason: collision with root package name */
    long f43795d = -1;

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f43792a.write(i10);
            long j10 = this.f43795d + 1;
            this.f43795d = j10;
            this.f43794c.o(j10);
        } catch (IOException e10) {
            this.f43794c.v(this.f43793b.c());
            d.d(this.f43794c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f43795d;
        if (j10 != -1) {
            this.f43794c.o(j10);
        }
        this.f43794c.t(this.f43793b.c());
        try {
            this.f43792a.close();
        } catch (IOException e10) {
            this.f43794c.v(this.f43793b.c());
            d.d(this.f43794c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f43792a.flush();
        } catch (IOException e10) {
            this.f43794c.v(this.f43793b.c());
            d.d(this.f43794c);
            throw e10;
        }
    }

    public b(OutputStream outputStream, g gVar, l lVar) {
        this.f43792a = outputStream;
        this.f43794c = gVar;
        this.f43793b = lVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f43792a.write(bArr);
            long length = this.f43795d + bArr.length;
            this.f43795d = length;
            this.f43794c.o(length);
        } catch (IOException e10) {
            this.f43794c.v(this.f43793b.c());
            d.d(this.f43794c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f43792a.write(bArr, i10, i11);
            long j10 = this.f43795d + i11;
            this.f43795d = j10;
            this.f43794c.o(j10);
        } catch (IOException e10) {
            this.f43794c.v(this.f43793b.c());
            d.d(this.f43794c);
            throw e10;
        }
    }
}
