package Gf;

import java.io.OutputStream;

/* loaded from: classes8.dex */
final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f12503a = 0;

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f12503a++;
    }

    long a() {
        return this.f12503a;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f12503a += bArr.length;
    }

    b() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f12503a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
