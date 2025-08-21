package Zg;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f43804a;

    /* renamed from: b, reason: collision with root package name */
    private int f43805b = 0;

    void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f43805b;
            this.f43805b = i12 + 1;
            c(i12, z10);
        }
    }

    private void c(int i10, boolean z10) {
        this.f43804a[i10] = z10 ? (byte) 1 : (byte) 0;
    }

    byte[] b(int i10) {
        int length = this.f43804a.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.f43804a[i11 / i10];
        }
        return bArr;
    }

    b(int i10) {
        this.f43804a = new byte[i10];
    }
}
