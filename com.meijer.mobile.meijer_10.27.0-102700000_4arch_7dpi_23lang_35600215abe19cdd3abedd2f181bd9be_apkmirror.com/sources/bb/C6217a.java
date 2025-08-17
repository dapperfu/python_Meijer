package bb;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6217a extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f60087g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f60088a;

    /* renamed from: b, reason: collision with root package name */
    private int f60089b;

    /* renamed from: c, reason: collision with root package name */
    private int f60090c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f60091d;

    /* renamed from: e, reason: collision with root package name */
    private int f60092e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f60093f;

    public C6217a() {
        this((byte) 0);
    }

    public final synchronized byte[] b() {
        int i10 = this.f60092e;
        if (i10 == 0) {
            return f60087g;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this.f60088a) {
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
                int i13 = this.f60092e;
                int i14 = i13 + i11;
                int i15 = i13 - this.f60090c;
                while (i11 > 0) {
                    int iMin = Math.min(i11, this.f60091d.length - i15);
                    System.arraycopy(bArr, i12 - i11, this.f60091d, i15, iMin);
                    i11 -= iMin;
                    if (i11 > 0) {
                        a(i14);
                        i15 = 0;
                    }
                }
                this.f60092e = i14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C6217a(byte b10) {
        this.f60088a = new ArrayList();
        this.f60093f = true;
        synchronized (this) {
            a(1024);
        }
    }

    private void a(int i10) {
        if (this.f60089b < this.f60088a.size() - 1) {
            this.f60090c += this.f60091d.length;
            int i11 = this.f60089b + 1;
            this.f60089b = i11;
            this.f60091d = this.f60088a.get(i11);
            return;
        }
        byte[] bArr = this.f60091d;
        if (bArr == null) {
            this.f60090c = 0;
        } else {
            i10 = Math.max(bArr.length << 1, i10 - this.f60090c);
            this.f60090c += this.f60091d.length;
        }
        this.f60089b++;
        byte[] bArr2 = new byte[i10];
        this.f60091d = bArr2;
        this.f60088a.add(bArr2);
    }

    @Deprecated
    public final String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            int i11 = this.f60092e;
            int i12 = i11 - this.f60090c;
            if (i12 == this.f60091d.length) {
                a(i11 + 1);
                i12 = 0;
            }
            this.f60091d[i12] = (byte) i10;
            this.f60092e++;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
