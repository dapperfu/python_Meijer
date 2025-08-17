package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f63765a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f63766b;

    /* renamed from: c, reason: collision with root package name */
    private Y6.b f63767c;

    /* renamed from: d, reason: collision with root package name */
    private int f63768d;

    public c(OutputStream outputStream, Y6.b bVar) {
        this(outputStream, bVar, 65536);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f63766b;
        int i11 = this.f63768d;
        this.f63768d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, Y6.b bVar, int i10) {
        this.f63765a = outputStream;
        this.f63767c = bVar;
        this.f63766b = (byte[]) bVar.c(i10, byte[].class);
    }

    private void a() throws IOException {
        int i10 = this.f63768d;
        if (i10 > 0) {
            this.f63765a.write(this.f63766b, 0, i10);
            this.f63768d = 0;
        }
    }

    private void b() throws IOException {
        if (this.f63768d == this.f63766b.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.f63766b;
        if (bArr != null) {
            this.f63767c.put(bArr);
            this.f63766b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f63765a.close();
            c();
        } catch (Throwable th2) {
            this.f63765a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f63765a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f63768d;
            if (i15 == 0 && i13 >= this.f63766b.length) {
                this.f63765a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f63766b.length - i15);
            System.arraycopy(bArr, i14, this.f63766b, this.f63768d, iMin);
            this.f63768d += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
