package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class V2 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f70762d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f70763a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f70764b;

    /* renamed from: c, reason: collision with root package name */
    private int f70765c;

    public static int b(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = i11 + 1;
            if ((f70762d[i11] & i10) != 0) {
                return i12;
            }
            i11 = i12;
        }
        return -1;
    }

    public static long c(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f70762d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public final int a() {
        return this.f70765c;
    }

    public final void e() {
        this.f70764b = 0;
        this.f70765c = 0;
    }

    public final long d(InterfaceC9236r0 interfaceC9236r0, boolean z10, boolean z11, int i10) throws IOException {
        if (this.f70764b == 0) {
            if (!interfaceC9236r0.b(this.f70763a, 0, 1, z10)) {
                return -1L;
            }
            int iB = b(this.f70763a[0] & 255);
            this.f70765c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f70764b = 1;
        }
        int i11 = this.f70765c;
        if (i11 > i10) {
            this.f70764b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC9236r0.zzi(this.f70763a, 1, i11 - 1);
        }
        this.f70764b = 0;
        return c(this.f70763a, this.f70765c, z11);
    }
}
