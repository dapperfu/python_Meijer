package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10219z1 implements InterfaceC9255q0 {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9575t0 f81170f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f81172h;

    /* renamed from: i, reason: collision with root package name */
    private long f81173i;

    /* renamed from: j, reason: collision with root package name */
    private int f81174j;

    /* renamed from: k, reason: collision with root package name */
    private int f81175k;

    /* renamed from: l, reason: collision with root package name */
    private int f81176l;

    /* renamed from: m, reason: collision with root package name */
    private long f81177m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f81178n;

    /* renamed from: o, reason: collision with root package name */
    private C10112y1 f81179o;

    /* renamed from: p, reason: collision with root package name */
    private C1 f81180p;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f81165a = new GQ(4);

    /* renamed from: b, reason: collision with root package name */
    private final GQ f81166b = new GQ(9);

    /* renamed from: c, reason: collision with root package name */
    private final GQ f81167c = new GQ(11);

    /* renamed from: d, reason: collision with root package name */
    private final GQ f81168d = new GQ();

    /* renamed from: e, reason: collision with root package name */
    private final A1 f81169e = new A1();

    /* renamed from: g, reason: collision with root package name */
    private int f81171g = 1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f81171g = 1;
            this.f81172h = false;
        } else {
            this.f81171g = 3;
        }
        this.f81174j = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f81170f = interfaceC9575t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    private final GQ e(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        if (this.f81176l > this.f81168d.s()) {
            GQ gq2 = this.f81168d;
            int iS = gq2.s();
            gq2.j(new byte[Math.max(iS + iS, this.f81176l)], 0);
        } else {
            this.f81168d.l(0);
        }
        this.f81168d.k(this.f81176l);
        interfaceC9361r0.zzi(this.f81168d.n(), 0, this.f81176l);
        return this.f81168d;
    }

    private final void f() {
        if (this.f81178n) {
            return;
        }
        this.f81170f.m(new P0(-9223372036854775807L, 0L));
        this.f81178n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9361r0 r17, com.google.android.gms.internal.ads.N0 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10219z1.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
        c8080f0.c(this.f81165a.n(), 0, 3, false);
        this.f81165a.l(0);
        if (this.f81165a.E() != 4607062) {
            return false;
        }
        c8080f0.c(this.f81165a.n(), 0, 2, false);
        this.f81165a.l(0);
        if ((this.f81165a.G() & 250) != 0) {
            return false;
        }
        c8080f0.c(this.f81165a.n(), 0, 4, false);
        this.f81165a.l(0);
        int iW = this.f81165a.w();
        interfaceC9361r0.zzj();
        C8080f0 c8080f02 = (C8080f0) interfaceC9361r0;
        c8080f02.h(iW, false);
        c8080f02.c(this.f81165a.n(), 0, 4, false);
        this.f81165a.l(0);
        return this.f81165a.w() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
