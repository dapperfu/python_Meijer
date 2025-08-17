package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10094z1 implements InterfaceC9130q0 {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9450t0 f80330f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f80332h;

    /* renamed from: i, reason: collision with root package name */
    private long f80333i;

    /* renamed from: j, reason: collision with root package name */
    private int f80334j;

    /* renamed from: k, reason: collision with root package name */
    private int f80335k;

    /* renamed from: l, reason: collision with root package name */
    private int f80336l;

    /* renamed from: m, reason: collision with root package name */
    private long f80337m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f80338n;

    /* renamed from: o, reason: collision with root package name */
    private C9987y1 f80339o;

    /* renamed from: p, reason: collision with root package name */
    private C1 f80340p;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f80325a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f80326b = new GQ(9);

    /* renamed from: c, reason: collision with root package name */
    private final GQ f80327c = new GQ(11);

    /* renamed from: d, reason: collision with root package name */
    private final GQ f80328d = new GQ();

    /* renamed from: e, reason: collision with root package name */
    private final A1 f80329e = new A1();

    /* renamed from: g, reason: collision with root package name */
    private int f80331g = 1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f80331g = 1;
            this.f80332h = false;
        } else {
            this.f80331g = 3;
        }
        this.f80334j = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f80330f = interfaceC9450t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    private final GQ e(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        if (this.f80336l > this.f80328d.s()) {
            GQ gq2 = this.f80328d;
            int iS = gq2.s();
            gq2.j(new byte[Math.max(iS + iS, this.f80336l)], 0);
        } else {
            this.f80328d.l(0);
        }
        this.f80328d.k(this.f80336l);
        interfaceC9236r0.zzi(this.f80328d.n(), 0, this.f80336l);
        return this.f80328d;
    }

    private final void f() {
        if (this.f80338n) {
            return;
        }
        this.f80330f.m(new P0(-9223372036854775807L, 0L));
        this.f80338n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9236r0 r17, com.google.android.gms.internal.ads.N0 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10094z1.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
        c7955f0.c(this.f80325a.n(), 0, 3, false);
        this.f80325a.l(0);
        if (this.f80325a.E() != 4607062) {
            return false;
        }
        c7955f0.c(this.f80325a.n(), 0, 2, false);
        this.f80325a.l(0);
        if ((this.f80325a.G() & 250) != 0) {
            return false;
        }
        c7955f0.c(this.f80325a.n(), 0, 4, false);
        this.f80325a.l(0);
        int iW = this.f80325a.w();
        interfaceC9236r0.zzj();
        C7955f0 c7955f02 = (C7955f0) interfaceC9236r0;
        c7955f02.h(iW, false);
        c7955f02.c(this.f80325a.n(), 0, 4, false);
        this.f80325a.l(0);
        return this.f80325a.w() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
