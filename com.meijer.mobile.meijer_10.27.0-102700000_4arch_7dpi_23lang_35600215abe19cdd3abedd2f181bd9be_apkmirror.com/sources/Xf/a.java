package Xf;

import Vf.g;
import ag.l;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f39308a;

    /* renamed from: b, reason: collision with root package name */
    private final g f39309b;

    /* renamed from: c, reason: collision with root package name */
    private final l f39310c;

    /* renamed from: e, reason: collision with root package name */
    private long f39312e;

    /* renamed from: d, reason: collision with root package name */
    private long f39311d = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f39313f = -1;

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i10 = this.f39308a.read();
            long jC = this.f39310c.c();
            if (this.f39312e == -1) {
                this.f39312e = jC;
            }
            if (i10 != -1 || this.f39313f != -1) {
                a(1L);
                this.f39309b.s(this.f39311d);
                return i10;
            }
            this.f39313f = jC;
            this.f39309b.v(jC);
            this.f39309b.b();
            return i10;
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private void a(long j10) {
        long j11 = this.f39311d;
        if (j11 == -1) {
            this.f39311d = j10;
        } else {
            this.f39311d = j11 + j10;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f39308a.available();
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f39310c.c();
        if (this.f39313f == -1) {
            this.f39313f = jC;
        }
        try {
            this.f39308a.close();
            long j10 = this.f39311d;
            if (j10 != -1) {
                this.f39309b.s(j10);
            }
            long j11 = this.f39312e;
            if (j11 != -1) {
                this.f39309b.w(j11);
            }
            this.f39309b.v(this.f39313f);
            this.f39309b.b();
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f39308a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f39308a.markSupported();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f39308a.reset();
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long jSkip = this.f39308a.skip(j10);
            long jC = this.f39310c.c();
            if (this.f39312e == -1) {
                this.f39312e = jC;
            }
            if (jSkip == 0 && j10 != 0 && this.f39313f == -1) {
                this.f39313f = jC;
                this.f39309b.v(jC);
                return jSkip;
            }
            a(jSkip);
            this.f39309b.s(this.f39311d);
            return jSkip;
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }

    public a(InputStream inputStream, g gVar, l lVar) {
        this.f39310c = lVar;
        this.f39308a = inputStream;
        this.f39309b = gVar;
        this.f39312e = gVar.e();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = this.f39308a.read(bArr, i10, i11);
            long jC = this.f39310c.c();
            if (this.f39312e == -1) {
                this.f39312e = jC;
            }
            if (i12 == -1 && this.f39313f == -1) {
                this.f39313f = jC;
                this.f39309b.v(jC);
                this.f39309b.b();
                return i12;
            }
            a(i12);
            this.f39309b.s(this.f39311d);
            return i12;
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i10 = this.f39308a.read(bArr);
            long jC = this.f39310c.c();
            if (this.f39312e == -1) {
                this.f39312e = jC;
            }
            if (i10 == -1 && this.f39313f == -1) {
                this.f39313f = jC;
                this.f39309b.v(jC);
                this.f39309b.b();
                return i10;
            }
            a(i10);
            this.f39309b.s(this.f39311d);
            return i10;
        } catch (IOException e10) {
            this.f39309b.v(this.f39310c.c());
            d.d(this.f39309b);
            throw e10;
        }
    }
}
