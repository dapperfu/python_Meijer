package Fd;

import java.io.OutputStream;

/* loaded from: classes6.dex */
final class N0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f9466a = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f9466a++;
    }

    final long a() {
        return this.f9466a;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f9466a += bArr.length;
    }

    N0() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f9466a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
