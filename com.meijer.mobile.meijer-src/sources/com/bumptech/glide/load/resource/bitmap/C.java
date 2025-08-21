package com.bumptech.glide.load.resource.bitmap;

import a7.InterfaceC5665b;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class C extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private volatile byte[] f64861a;

    /* renamed from: b, reason: collision with root package name */
    private int f64862b;

    /* renamed from: c, reason: collision with root package name */
    private int f64863c;

    /* renamed from: d, reason: collision with root package name */
    private int f64864d;

    /* renamed from: e, reason: collision with root package name */
    private int f64865e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5665b f64866f;

    public C(InputStream inputStream, InterfaceC5665b interfaceC5665b) {
        this(inputStream, interfaceC5665b, 65536);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f64861a == null || inputStream == null) {
            throw d();
        }
        return (this.f64862b - this.f64865e) + inputStream.available();
    }

    public synchronized void b() {
        this.f64863c = this.f64861a.length;
    }

    public synchronized void c() {
        if (this.f64861a != null) {
            this.f64866f.put(this.f64861a);
            this.f64861a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f64863c = Math.max(this.f64863c, i10);
        this.f64864d = this.f64865e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f64861a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f64865e >= this.f64862b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f64861a && (bArr = this.f64861a) == null) {
            throw d();
        }
        int i10 = this.f64862b;
        int i11 = this.f64865e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f64865e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f64861a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f64864d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f64865e + " markLimit: " + this.f64863c);
        }
        this.f64865e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f64861a;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i10 = this.f64862b;
        int i11 = this.f64865e;
        if (i10 - i11 >= j10) {
            this.f64865e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f64865e = i10;
        if (this.f64864d == -1 || j10 > this.f64863c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f64864d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f64862b;
        int i13 = this.f64865e;
        if (i12 - i13 >= j10 - j11) {
            this.f64865e = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f64865e = i12;
        return j12;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    C(InputStream inputStream, InterfaceC5665b interfaceC5665b, int i10) {
        super(inputStream);
        this.f64864d = -1;
        this.f64866f = interfaceC5665b;
        this.f64861a = (byte[]) interfaceC5665b.c(i10, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f64864d;
        if (i10 != -1) {
            int i11 = this.f64865e - i10;
            int i12 = this.f64863c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f64862b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f64866f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f64861a = bArr2;
                    this.f64866f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f64865e - this.f64864d;
                this.f64865e = i13;
                this.f64864d = 0;
                this.f64862b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f64865e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f64862b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f64864d = -1;
            this.f64865e = 0;
            this.f64862b = i16;
        }
        return i16;
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f64861a != null) {
            this.f64866f.put(this.f64861a);
            this.f64861a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f64861a;
        if (bArr2 == null) {
            throw d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f64865e;
            int i15 = this.f64862b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f64865e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f64864d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f64861a && (bArr2 = this.f64861a) == null) {
                        throw d();
                    }
                    int i17 = this.f64862b;
                    int i18 = this.f64865e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f64865e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw d();
        }
    }
}
