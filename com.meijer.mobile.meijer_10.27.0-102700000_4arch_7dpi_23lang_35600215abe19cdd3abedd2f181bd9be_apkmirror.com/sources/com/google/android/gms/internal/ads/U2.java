package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class U2 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f70524a = new GQ(8);

    /* renamed from: b, reason: collision with root package name */
    private int f70525b;

    private final long b(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        int i10;
        C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
        int i11 = 0;
        c7955f0.c(this.f70524a.n(), 0, 1, false);
        int i12 = this.f70524a.n()[0] & 255;
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
        c7955f0.c(this.f70524a.n(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (this.f70524a.n()[i11] & 255) + (i15 << 8);
        }
        this.f70525b += i10;
        return i15;
    }

    public final boolean a(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        long jZzd = interfaceC9236r0.zzd();
        long j10 = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j10 = jZzd;
        }
        C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
        c7955f0.c(this.f70524a.n(), 0, 4, false);
        long jK = this.f70524a.K();
        this.f70525b = 4;
        while (jK != 440786851) {
            int i10 = (int) j10;
            int i11 = this.f70525b + 1;
            this.f70525b = i11;
            if (i11 == i10) {
                return false;
            }
            c7955f0.c(this.f70524a.n(), 0, 1, false);
            jK = ((jK << 8) & (-256)) | (this.f70524a.n()[0] & 255);
        }
        long jB = b(interfaceC9236r0);
        long j11 = this.f70525b;
        if (jB != Long.MIN_VALUE) {
            long j12 = j11 + jB;
            if (jZzd == -1 || j12 < jZzd) {
                while (true) {
                    long j13 = this.f70525b;
                    if (j13 < j12) {
                        if (b(interfaceC9236r0) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jB2 = b(interfaceC9236r0);
                        if (jB2 < 0) {
                            return false;
                        }
                        if (jB2 != 0) {
                            int i12 = (int) jB2;
                            c7955f0.h(i12, false);
                            this.f70525b += i12;
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
