package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class U3 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9450t0 f70527a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7643c4 f70528b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f70529c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f70527a = interfaceC9450t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    private final boolean e(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        W3 w32 = new W3();
        if (w32.b(interfaceC9236r0, true) && (w32.f70992a & 2) == 2) {
            int iMin = Math.min(w32.f70996e, 8);
            GQ gq2 = new GQ(iMin);
            interfaceC9236r0.g(gq2.n(), 0, iMin);
            gq2.l(0);
            if (gq2.r() >= 5 && gq2.C() == 127 && gq2.K() == 1179402563) {
                this.f70528b = new T3();
            } else {
                gq2.l(0);
                if (C7744d1.d(1, gq2, true)) {
                    this.f70528b = new C7856e4();
                } else {
                    gq2.l(0);
                    if (Y3.j(gq2)) {
                        this.f70528b = new Y3();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        AbstractC7643c4 abstractC7643c4 = this.f70528b;
        if (abstractC7643c4 != null) {
            abstractC7643c4.i(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        C8086gC.b(this.f70527a);
        if (this.f70528b == null) {
            if (!e(interfaceC9236r0)) {
                throw zzbc.a("Failed to determine bitstream type", null);
            }
            interfaceC9236r0.zzj();
        }
        if (!this.f70529c) {
            X0 x0A = this.f70527a.a(0, 1);
            this.f70527a.e();
            this.f70528b.g(this.f70527a, x0A);
            this.f70529c = true;
        }
        return this.f70528b.d(interfaceC9236r0, n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        try {
            return e(interfaceC9236r0);
        } catch (zzbc unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
