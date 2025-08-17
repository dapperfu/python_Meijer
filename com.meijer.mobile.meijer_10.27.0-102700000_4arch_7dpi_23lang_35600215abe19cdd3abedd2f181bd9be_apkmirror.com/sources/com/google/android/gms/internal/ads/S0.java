package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class S0 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f69981a;

    /* renamed from: b, reason: collision with root package name */
    private final int f69982b;

    /* renamed from: c, reason: collision with root package name */
    private final String f69983c;

    /* renamed from: d, reason: collision with root package name */
    private int f69984d;

    /* renamed from: e, reason: collision with root package name */
    private int f69985e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9450t0 f69986f;

    /* renamed from: g, reason: collision with root package name */
    private X0 f69987g;

    public S0(int i10, int i11, String str) {
        this.f69981a = i10;
        this.f69982b = i11;
        this.f69983c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        if (j10 == 0 || this.f69985e == 1) {
            this.f69985e = 1;
            this.f69984d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        int i10 = this.f69985e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        X0 x02 = this.f69987g;
        x02.getClass();
        int iB = x02.b(interfaceC9236r0, 1024, true);
        if (iB == -1) {
            this.f69985e = 2;
            this.f69987g.a(0L, 1, this.f69984d, 0, null);
            this.f69984d = 0;
        } else {
            this.f69984d += iB;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        C8086gC.f((this.f69981a == -1 || this.f69982b == -1) ? false : true);
        GQ gq2 = new GQ(this.f69982b);
        ((C7955f0) interfaceC9236r0).c(gq2.n(), 0, this.f69982b, false);
        return gq2.G() == this.f69981a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f69986f = interfaceC9450t0;
        X0 x0A = interfaceC9450t0.a(1024, 4);
        this.f69987g = x0A;
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B(this.f69983c);
        x0A.d(c9592uH0.H());
        this.f69986f.e();
        this.f69986f.m(new T0(-9223372036854775807L));
        this.f69985e = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
