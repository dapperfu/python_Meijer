package P3;

import java.io.IOException;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class g {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f25428d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25429a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f25430b;

    /* renamed from: c, reason: collision with root package name */
    private int f25431c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f25428d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f25428d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public void e() {
        this.f25430b = 0;
        this.f25431c = 0;
    }

    public int b() {
        return this.f25431c;
    }

    public long d(InterfaceC18078q interfaceC18078q, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f25430b == 0) {
            if (!interfaceC18078q.f(this.f25429a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f25429a[0] & 255);
            this.f25431c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f25430b = 1;
        }
        int i11 = this.f25431c;
        if (i11 > i10) {
            this.f25430b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC18078q.readFully(this.f25429a, 1, i11 - 1);
        }
        this.f25430b = 0;
        return a(this.f25429a, this.f25431c, z11);
    }
}
