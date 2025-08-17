package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9569u6 {
    public static C9355s6 b(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        byte[] bArr;
        GQ gq2 = new GQ(16);
        C9462t6 c9462t6D = d(1718449184, interfaceC9236r0, gq2);
        C8086gC.f(c9462t6D.f78489b >= 16);
        interfaceC9236r0.g(gq2.n(), 0, 16);
        gq2.l(0);
        int iA = gq2.A();
        int iA2 = gq2.A();
        int iZ = gq2.z();
        int iZ2 = gq2.z();
        int iA3 = gq2.A();
        int iA4 = gq2.A();
        int i10 = ((int) c9462t6D.f78489b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC9236r0.g(bArr, 0, i10);
        } else {
            bArr = OV.f69096f;
        }
        byte[] bArr2 = bArr;
        interfaceC9236r0.e((int) (interfaceC9236r0.zze() - interfaceC9236r0.zzf()));
        return new C9355s6(iA, iA2, iZ, iZ2, iA3, iA4, bArr2);
    }

    public static boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        GQ gq2 = new GQ(8);
        int i10 = C9462t6.a(interfaceC9236r0, gq2).f78488a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC9236r0.g(gq2.n(), 0, 4);
        gq2.l(0);
        int iW = gq2.w();
        if (iW == 1463899717) {
            return true;
        }
        C9917xL.c("WavHeaderReader", "Unsupported form type: " + iW);
        return false;
    }

    public static Pair a(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        interfaceC9236r0.zzj();
        C9462t6 c9462t6D = d(1684108385, interfaceC9236r0, new GQ(8));
        interfaceC9236r0.e(8);
        return Pair.create(Long.valueOf(interfaceC9236r0.zzf()), Long.valueOf(c9462t6D.f78489b));
    }

    private static C9462t6 d(int i10, InterfaceC9236r0 interfaceC9236r0, GQ gq2) throws IOException {
        C9462t6 c9462t6A = C9462t6.a(interfaceC9236r0, gq2);
        while (true) {
            int i11 = c9462t6A.f78488a;
            if (i11 != i10) {
                C9917xL.f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
                long j10 = c9462t6A.f78489b;
                long j11 = 8 + j10;
                if ((1 & j10) != 0) {
                    j11 = j10 + 9;
                }
                if (j11 <= 2147483647L) {
                    interfaceC9236r0.e((int) j11);
                    c9462t6A = C9462t6.a(interfaceC9236r0, gq2);
                } else {
                    throw zzbc.c("Chunk is too large (~2GB+) to skip; id: " + c9462t6A.f78488a);
                }
            } else {
                return c9462t6A;
            }
        }
    }
}
