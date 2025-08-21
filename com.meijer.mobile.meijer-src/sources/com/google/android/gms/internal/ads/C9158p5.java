package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9158p5 implements InterfaceC9255q0 {

    /* renamed from: c, reason: collision with root package name */
    private final GQ f78328c;

    /* renamed from: d, reason: collision with root package name */
    private final C8124fQ f78329d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC9575t0 f78330e;

    /* renamed from: f, reason: collision with root package name */
    private long f78331f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f78333h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f78334i;

    /* renamed from: a, reason: collision with root package name */
    private final C9265q5 f78326a = new C9265q5(true, null, 0);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f78327b = new GQ(RecyclerView.m.FLAG_MOVED);

    /* renamed from: g, reason: collision with root package name */
    private long f78332g = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f78333h = false;
        this.f78326a.zze();
        this.f78331f = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        int i10 = 0;
        while (true) {
            C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
            c8080f0.c(this.f78328c.n(), 0, 10, false);
            this.f78328c.l(0);
            if (this.f78328c.E() != 4801587) {
                break;
            }
            this.f78328c.m(3);
            int iB = this.f78328c.B();
            i10 += iB + 10;
            c8080f0.h(iB, false);
        }
        interfaceC9361r0.zzj();
        C8080f0 c8080f02 = (C8080f0) interfaceC9361r0;
        c8080f02.h(i10, false);
        if (this.f78332g == -1) {
            this.f78332g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            c8080f02.c(this.f78328c.n(), 0, 2, false);
            this.f78328c.l(0);
            if (C9265q5.d(this.f78328c.G())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c8080f02.c(this.f78328c.n(), 0, 4, false);
                this.f78329d.l(14);
                int iD = this.f78329d.d(13);
                if (iD <= 6) {
                    i13++;
                    interfaceC9361r0.zzj();
                    c8080f02.h(i13, false);
                } else {
                    c8080f02.h(iD - 6, false);
                    i12 += iD;
                }
            } else {
                i13++;
                interfaceC9361r0.zzj();
                c8080f02.h(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        C8211gC.b(this.f78330e);
        int iZza = interfaceC9361r0.zza(this.f78327b.n(), 0, RecyclerView.m.FLAG_MOVED);
        if (!this.f78334i) {
            this.f78330e.m(new P0(-9223372036854775807L, 0L));
            this.f78334i = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.f78327b.l(0);
        this.f78327b.k(iZza);
        if (!this.f78333h) {
            this.f78326a.b(this.f78331f, 4);
            this.f78333h = true;
        }
        this.f78326a.a(this.f78327b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f78330e = interfaceC9575t0;
        this.f78326a.c(interfaceC9575t0, new C8518j6(Integer.MIN_VALUE, 0, 1));
        interfaceC9575t0.e();
    }

    public C9158p5(int i10) {
        GQ gq2 = new GQ(10);
        this.f78328c = gq2;
        byte[] bArrN = gq2.n();
        this.f78329d = new C8124fQ(bArrN, bArrN.length);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
