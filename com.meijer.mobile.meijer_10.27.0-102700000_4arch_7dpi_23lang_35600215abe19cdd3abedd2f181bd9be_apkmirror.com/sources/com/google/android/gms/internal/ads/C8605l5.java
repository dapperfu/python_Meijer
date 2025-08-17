package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8605l5 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8712m5 f75745a = new C8712m5(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f75746b = new GQ(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f75747c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f75747c = false;
        this.f75745a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        int iZza = interfaceC9236r0.zza(this.f75746b.n(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.f75746b.l(0);
        this.f75746b.k(iZza);
        if (!this.f75747c) {
            this.f75745a.b(0L, 4);
            this.f75747c = true;
        }
        this.f75745a.a(this.f75746b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        GQ gq2 = new GQ(10);
        int i10 = 0;
        while (true) {
            C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
            c7955f0.c(gq2.n(), 0, 10, false);
            gq2.l(0);
            if (gq2.E() != 4801587) {
                break;
            }
            gq2.m(3);
            int iB = gq2.B();
            i10 += iB + 10;
            c7955f0.h(iB, false);
        }
        interfaceC9236r0.zzj();
        C7955f0 c7955f02 = (C7955f0) interfaceC9236r0;
        c7955f02.h(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            c7955f02.c(gq2.n(), 0, 6, false);
            gq2.l(0);
            if (gq2.G() != 2935) {
                interfaceC9236r0.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c7955f02.h(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iB2 = P.b(gq2.n());
                if (iB2 == -1) {
                    return false;
                }
                c7955f02.h(iB2 - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f75745a.c(interfaceC9450t0, new C8393j6(Integer.MIN_VALUE, 0, 1));
        interfaceC9450t0.e();
        interfaceC9450t0.m(new P0(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
