package Gd;

import java.io.OutputStream;

/* renamed from: Gd.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3658g extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f12016a = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f12016a++;
    }

    final long a() {
        return this.f12016a;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f12016a += bArr.length;
    }

    C3658g() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f12016a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
