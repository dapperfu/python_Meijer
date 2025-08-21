package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class U2 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f71364a = new GQ(8);

    /* renamed from: b, reason: collision with root package name */
    private int f71365b;

    private final long b(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        int i10;
        C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
        int i11 = 0;
        c8080f0.c(this.f71364a.n(), 0, 1, false);
        int i12 = this.f71364a.n()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        c8080f0.c(this.f71364a.n(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (this.f71364a.n()[i11] & 255) + (i15 << 8);
        }
        this.f71365b += i10;
        return i15;
    }

    public final boolean a(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        long jZzd = interfaceC9361r0.zzd();
        long j10 = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j10 = jZzd;
        }
        C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
        c8080f0.c(this.f71364a.n(), 0, 4, false);
        long jK = this.f71364a.K();
        this.f71365b = 4;
        while (jK != 440786851) {
            int i10 = (int) j10;
            int i11 = this.f71365b + 1;
            this.f71365b = i11;
            if (i11 == i10) {
                return false;
            }
            c8080f0.c(this.f71364a.n(), 0, 1, false);
            jK = ((jK << 8) & (-256)) | (this.f71364a.n()[0] & 255);
        }
        long jB = b(interfaceC9361r0);
        long j11 = this.f71365b;
        if (jB != Long.MIN_VALUE) {
            long j12 = j11 + jB;
            if (jZzd == -1 || j12 < jZzd) {
                while (true) {
                    long j13 = this.f71365b;
                    if (j13 < j12) {
                        if (b(interfaceC9361r0) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jB2 = b(interfaceC9361r0);
                        if (jB2 < 0) {
                            return false;
                        }
                        if (jB2 != 0) {
                            int i12 = (int) jB2;
                            c8080f0.h(i12, false);
                            this.f71365b += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
