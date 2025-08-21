package com.bumptech.glide.load.data;

import a7.InterfaceC5665b;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f64605a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f64606b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5665b f64607c;

    /* renamed from: d, reason: collision with root package name */
    private int f64608d;

    public c(OutputStream outputStream, InterfaceC5665b interfaceC5665b) {
        this(outputStream, interfaceC5665b, 65536);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f64606b;
        int i11 = this.f64608d;
        this.f64608d = i11 + 1;
        bArr[i11] = (byte) i10;
        b();
    }

    c(OutputStream outputStream, InterfaceC5665b interfaceC5665b, int i10) {
        this.f64605a = outputStream;
        this.f64607c = interfaceC5665b;
        this.f64606b = (byte[]) interfaceC5665b.c(i10, byte[].class);
    }

    private void a() throws IOException {
        int i10 = this.f64608d;
        if (i10 > 0) {
            this.f64605a.write(this.f64606b, 0, i10);
            this.f64608d = 0;
        }
    }

    private void b() throws IOException {
        if (this.f64608d == this.f64606b.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.f64606b;
        if (bArr != null) {
            this.f64607c.put(bArr);
            this.f64606b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f64605a.close();
            c();
        } catch (Throwable th2) {
            this.f64605a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f64605a.flush();
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
            int i15 = this.f64608d;
            if (i15 == 0 && i13 >= this.f64606b.length) {
                this.f64605a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f64606b.length - i15);
            System.arraycopy(bArr, i14, this.f64606b, this.f64608d, iMin);
            this.f64608d += iMin;
            i12 += iMin;
            b();
        } while (i12 < i11);
    }
}
