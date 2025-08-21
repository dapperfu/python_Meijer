package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8730l5 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8837m5 f76585a = new C8837m5(null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f76586b = new GQ(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f76587c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f76587c = false;
        this.f76585a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        int iZza = interfaceC9361r0.zza(this.f76586b.n(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.f76586b.l(0);
        this.f76586b.k(iZza);
        if (!this.f76587c) {
            this.f76585a.b(0L, 4);
            this.f76587c = true;
        }
        this.f76585a.a(this.f76586b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        GQ gq2 = new GQ(10);
        int i10 = 0;
        while (true) {
            C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
            c8080f0.c(gq2.n(), 0, 10, false);
            gq2.l(0);
            if (gq2.E() != 4801587) {
                break;
            }
            gq2.m(3);
            int iB = gq2.B();
            i10 += iB + 10;
            c8080f0.h(iB, false);
        }
        interfaceC9361r0.zzj();
        C8080f0 c8080f02 = (C8080f0) interfaceC9361r0;
        c8080f02.h(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            c8080f02.c(gq2.n(), 0, 6, false);
            gq2.l(0);
            if (gq2.G() != 2935) {
                interfaceC9361r0.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c8080f02.h(i12, false);
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
                c8080f02.h(iB2 - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f76585a.c(interfaceC9575t0, new C8518j6(Integer.MIN_VALUE, 0, 1));
        interfaceC9575t0.e();
        interfaceC9575t0.m(new P0(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
