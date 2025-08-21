package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class U3 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9575t0 f71367a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7768c4 f71368b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71369c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f71367a = interfaceC9575t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    private final boolean e(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        W3 w32 = new W3();
        if (w32.b(interfaceC9361r0, true) && (w32.f71832a & 2) == 2) {
            int iMin = Math.min(w32.f71836e, 8);
            GQ gq2 = new GQ(iMin);
            interfaceC9361r0.g(gq2.n(), 0, iMin);
            gq2.l(0);
            if (gq2.r() >= 5 && gq2.C() == 127 && gq2.K() == 1179402563) {
                this.f71368b = new T3();
            } else {
                gq2.l(0);
                if (C7869d1.d(1, gq2, true)) {
                    this.f71368b = new C7981e4();
                } else {
                    gq2.l(0);
                    if (Y3.j(gq2)) {
                        this.f71368b = new Y3();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        AbstractC7768c4 abstractC7768c4 = this.f71368b;
        if (abstractC7768c4 != null) {
            abstractC7768c4.i(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        C8211gC.b(this.f71367a);
        if (this.f71368b == null) {
            if (!e(interfaceC9361r0)) {
                throw zzbc.a("Failed to determine bitstream type", null);
            }
            interfaceC9361r0.zzj();
        }
        if (!this.f71369c) {
            X0 x0A = this.f71367a.a(0, 1);
            this.f71367a.e();
            this.f71368b.g(this.f71367a, x0A);
            this.f71369c = true;
        }
        return this.f71368b.d(interfaceC9361r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        try {
            return e(interfaceC9361r0);
        } catch (zzbc unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
