package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8819n5 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8926o5 f76994a = new C8926o5(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f76995b = new GQ(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f76996c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f76996c = false;
        this.f76994a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        int iZza = interfaceC9236r0.zza(this.f76995b.n(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.f76995b.l(0);
        this.f76995b.k(iZza);
        if (!this.f76996c) {
            this.f76994a.b(0L, 4);
            this.f76996c = true;
        }
        this.f76994a.a(this.f76995b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        int i10;
        GQ gq2 = new GQ(10);
        int i11 = 0;
        while (true) {
            C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
            c7955f0.c(gq2.n(), 0, 10, false);
            gq2.l(0);
            if (gq2.E() != 4801587) {
                break;
            }
            gq2.m(3);
            int iB = gq2.B();
            i11 += iB + 10;
            c7955f0.h(iB, false);
        }
        interfaceC9236r0.zzj();
        C7955f0 c7955f02 = (C7955f0) interfaceC9236r0;
        c7955f02.h(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            c7955f02.c(gq2.n(), 0, 7, false);
            gq2.l(0);
            int iG = gq2.G();
            if (iG == 44096 || iG == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrN = gq2.n();
                int i15 = T.f70216b;
                if (bArrN.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((bArrN[2] & 255) << 8) | (bArrN[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((bArrN[4] & 255) << 16) | ((bArrN[5] & 255) << 8) | (bArrN[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iG == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                c7955f02.h(i10 - 7, false);
            } else {
                interfaceC9236r0.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                c7955f02.h(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f76994a.c(interfaceC9450t0, new C8393j6(Integer.MIN_VALUE, 0, 1));
        interfaceC9450t0.e();
        interfaceC9450t0.m(new P0(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
