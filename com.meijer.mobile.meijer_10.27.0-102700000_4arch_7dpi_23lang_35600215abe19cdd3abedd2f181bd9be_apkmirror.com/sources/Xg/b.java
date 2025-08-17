package Xg;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f39326a;

    /* renamed from: b, reason: collision with root package name */
    private int f39327b = 0;

    void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f39327b;
            this.f39327b = i12 + 1;
            c(i12, z10);
        }
    }

    private void c(int i10, boolean z10) {
        this.f39326a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    byte[] b(int i10) {
        int length = this.f39326a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f39326a[i11 / i10];
        }
        return bArr;
    }

    b(int i10) {
        this.f39326a = new byte[i10];
    }
}
