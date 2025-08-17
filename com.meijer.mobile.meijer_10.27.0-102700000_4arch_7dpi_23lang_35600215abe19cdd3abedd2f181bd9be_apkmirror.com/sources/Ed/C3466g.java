package Ed;

import java.io.OutputStream;

/* renamed from: Ed.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3466g extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f8464a = 0;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f8464a++;
    }

    final long a() {
        return this.f8464a;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f8464a += bArr.length;
    }

    C3466g() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
            this.f8464a += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
