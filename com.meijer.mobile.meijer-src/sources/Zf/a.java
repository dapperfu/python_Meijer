package Zf;

import Xf.g;
import cg.l;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f43786a;

    /* renamed from: b, reason: collision with root package name */
    private final g f43787b;

    /* renamed from: c, reason: collision with root package name */
    private final l f43788c;

    /* renamed from: e, reason: collision with root package name */
    private long f43790e;

    /* renamed from: d, reason: collision with root package name */
    private long f43789d = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f43791f = -1;

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i10 = this.f43786a.read();
            long jC = this.f43788c.c();
            if (this.f43790e == -1) {
                this.f43790e = jC;
            }
            if (i10 != -1 || this.f43791f != -1) {
                a(1L);
                this.f43787b.s(this.f43789d);
                return i10;
            }
            this.f43791f = jC;
            this.f43787b.v(jC);
            this.f43787b.b();
            return i10;
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private void a(long j10) {
        long j11 = this.f43789d;
        if (j11 == -1) {
            this.f43789d = j10;
        } else {
            this.f43789d = j11 + j10;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f43786a.available();
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f43788c.c();
        if (this.f43791f == -1) {
            this.f43791f = jC;
        }
        try {
            this.f43786a.close();
            long j10 = this.f43789d;
            if (j10 != -1) {
                this.f43787b.s(j10);
            }
            long j11 = this.f43790e;
            if (j11 != -1) {
                this.f43787b.w(j11);
            }
            this.f43787b.v(this.f43791f);
            this.f43787b.b();
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f43786a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f43786a.markSupported();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f43786a.reset();
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long jSkip = this.f43786a.skip(j10);
            long jC = this.f43788c.c();
            if (this.f43790e == -1) {
                this.f43790e = jC;
            }
            if (jSkip == 0 && j10 != 0 && this.f43791f == -1) {
                this.f43791f = jC;
                this.f43787b.v(jC);
                return jSkip;
            }
            a(jSkip);
            this.f43787b.s(this.f43789d);
            return jSkip;
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }

    public a(InputStream inputStream, g gVar, l lVar) {
        this.f43788c = lVar;
        this.f43786a = inputStream;
        this.f43787b = gVar;
        this.f43790e = gVar.e();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = this.f43786a.read(bArr, i10, i11);
            long jC = this.f43788c.c();
            if (this.f43790e == -1) {
                this.f43790e = jC;
            }
            if (i12 == -1 && this.f43791f == -1) {
                this.f43791f = jC;
                this.f43787b.v(jC);
                this.f43787b.b();
                return i12;
            }
            a(i12);
            this.f43787b.s(this.f43789d);
            return i12;
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i10 = this.f43786a.read(bArr);
            long jC = this.f43788c.c();
            if (this.f43790e == -1) {
                this.f43790e = jC;
            }
            if (i10 == -1 && this.f43791f == -1) {
                this.f43791f = jC;
                this.f43787b.v(jC);
                this.f43787b.b();
                return i10;
            }
            a(i10);
            this.f43787b.s(this.f43789d);
            return i10;
        } catch (IOException e10) {
            this.f43787b.v(this.f43788c.c());
            d.d(this.f43787b);
            throw e10;
        }
    }
}
