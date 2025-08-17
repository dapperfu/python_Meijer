package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9033p5 implements InterfaceC9130q0 {

    /* renamed from: c, reason: collision with root package name */
    private final GQ f77488c;

    /* renamed from: d, reason: collision with root package name */
    private final C7999fQ f77489d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC9450t0 f77490e;

    /* renamed from: f, reason: collision with root package name */
    private long f77491f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f77493h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f77494i;

    /* renamed from: a, reason: collision with root package name */
    private final C9140q5 f77486a = new C9140q5(true, null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f77487b = new GQ(RecyclerView.m.FLAG_MOVED);

    /* renamed from: g, reason: collision with root package name */
    private long f77492g = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f77493h = false;
        this.f77486a.zze();
        this.f77491f = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        int i10 = 0;
        while (true) {
            C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
            c7955f0.c(this.f77488c.n(), 0, 10, false);
            this.f77488c.l(0);
            if (this.f77488c.E() != 4801587) {
                break;
            }
            this.f77488c.m(3);
            int iB = this.f77488c.B();
            i10 += iB + 10;
            c7955f0.h(iB, false);
        }
        interfaceC9236r0.zzj();
        C7955f0 c7955f02 = (C7955f0) interfaceC9236r0;
        c7955f02.h(i10, false);
        if (this.f77492g == -1) {
            this.f77492g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            c7955f02.c(this.f77488c.n(), 0, 2, false);
            this.f77488c.l(0);
            if (C9140q5.d(this.f77488c.G())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c7955f02.c(this.f77488c.n(), 0, 4, false);
                this.f77489d.l(14);
                int iD = this.f77489d.d(13);
                if (iD <= 6) {
                    i13++;
                    interfaceC9236r0.zzj();
                    c7955f02.h(i13, false);
                } else {
                    c7955f02.h(iD - 6, false);
                    i12 += iD;
                }
            } else {
                i13++;
                interfaceC9236r0.zzj();
                c7955f02.h(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws IOException {
        C8086gC.b(this.f77490e);
        int iZza = interfaceC9236r0.zza(this.f77487b.n(), 0, RecyclerView.m.FLAG_MOVED);
        if (!this.f77494i) {
            this.f77490e.m(new P0(-9223372036854775807L, 0L));
            this.f77494i = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.f77487b.l(0);
        this.f77487b.k(iZza);
        if (!this.f77493h) {
            this.f77486a.b(this.f77491f, 4);
            this.f77493h = true;
        }
        this.f77486a.a(this.f77487b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f77490e = interfaceC9450t0;
        this.f77486a.c(interfaceC9450t0, new C8393j6(Integer.MIN_VALUE, 0, 1));
        interfaceC9450t0.e();
    }

    public C9033p5(int i10) {
        GQ gq2 = new GQ(10);
        this.f77488c = gq2;
        byte[] bArrN = gq2.n();
        this.f77489d = new C7999fQ(bArrN, bArrN.length);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
