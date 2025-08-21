package db;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13648a extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f128322g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f128323a;

    /* renamed from: b, reason: collision with root package name */
    private int f128324b;

    /* renamed from: c, reason: collision with root package name */
    private int f128325c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f128326d;

    /* renamed from: e, reason: collision with root package name */
    private int f128327e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f128328f;

    public C13648a() {
        this((byte) 0);
    }

    public final synchronized byte[] b() {
        int i10 = this.f128327e;
        if (i10 == 0) {
            return f128322g;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this.f128323a) {
            int iMin = Math.min(bArr2.length, i10);
            System.arraycopy(bArr2, 0, bArr, i11, iMin);
            i11 += iMin;
            i10 -= iMin;
            if (i10 == 0) {
                break;
            }
        }
        return bArr;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        synchronized (this) {
            try {
                int i13 = this.f128327e;
                int i14 = i13 + i11;
                int i15 = i13 - this.f128325c;
                while (i11 > 0) {
                    int iMin = Math.min(i11, this.f128326d.length - i15);
                    System.arraycopy(bArr, i12 - i11, this.f128326d, i15, iMin);
                    i11 -= iMin;
                    if (i11 > 0) {
                        a(i14);
                        i15 = 0;
                    }
                }
                this.f128327e = i14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C13648a(byte b10) {
        this.f128323a = new ArrayList();
        this.f128328f = true;
        synchronized (this) {
            a(1024);
        }
    }

    private void a(int i10) {
        if (this.f128324b < this.f128323a.size() - 1) {
            this.f128325c += this.f128326d.length;
            int i11 = this.f128324b + 1;
            this.f128324b = i11;
            this.f128326d = this.f128323a.get(i11);
            return;
        }
        byte[] bArr = this.f128326d;
        if (bArr == null) {
            this.f128325c = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.f128325c);
            this.f128325c += this.f128326d.length;
        }
        this.f128324b++;
        byte[] bArr2 = new byte[i10];
        this.f128326d = bArr2;
        this.f128323a.add(bArr2);
    }

    @Deprecated
    public final String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            int i11 = this.f128327e;
            int i12 = i11 - this.f128325c;
            if (i12 == this.f128326d.length) {
                a(i11 + 1);
                i12 = 0;
            }
            this.f128326d[i12] = (byte) i10;
            this.f128327e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
