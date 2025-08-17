package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8490k1 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f75553a;

    /* renamed from: b, reason: collision with root package name */
    private final C8278i1 f75554b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f75555c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8710m4 f75556d;

    /* renamed from: e, reason: collision with root package name */
    private int f75557e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9450t0 f75558f;

    /* renamed from: g, reason: collision with root package name */
    private C8597l1 f75559g;

    /* renamed from: h, reason: collision with root package name */
    private long f75560h;

    /* renamed from: i, reason: collision with root package name */
    private C8811n1[] f75561i;

    /* renamed from: j, reason: collision with root package name */
    private long f75562j;

    /* renamed from: k, reason: collision with root package name */
    private C8811n1 f75563k;

    /* renamed from: l, reason: collision with root package name */
    private int f75564l;

    /* renamed from: m, reason: collision with root package name */
    private long f75565m;

    /* renamed from: n, reason: collision with root package name */
    private long f75566n;

    /* renamed from: o, reason: collision with root package name */
    private int f75567o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f75568p;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f75557e = 0;
        if (this.f75555c) {
            interfaceC9450t0 = new C9031p4(interfaceC9450t0, this.f75556d);
        }
        this.f75558f = interfaceC9450t0;
        this.f75562j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    private final C8811n1 f(int i10) {
        for (C8811n1 c8811n1 : this.f75561i) {
            if (c8811n1.f(i10)) {
                return c8811n1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f75562j = -1L;
        this.f75563k = null;
        for (C8811n1 c8811n1 : this.f75561i) {
            c8811n1.e(j10);
        }
        if (j10 == 0) {
            this.f75557e = this.f75561i.length != 0 ? 3 : 0;
        } else {
            this.f75557e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02f5  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9236r0 r29, com.google.android.gms.internal.ads.N0 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8490k1.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        interfaceC9236r0.g(this.f75553a.n(), 0, 12);
        this.f75553a.l(0);
        if (this.f75553a.y() != 1179011410) {
            return false;
        }
        this.f75553a.m(4);
        return this.f75553a.y() == 541677121;
    }

    public C8490k1(int i10, InterfaceC8710m4 interfaceC8710m4) {
        this.f75556d = interfaceC8710m4;
        this.f75555c = 1 == (i10 ^ 1);
        this.f75553a = new GQ(12);
        this.f75554b = new C8278i1(null);
        this.f75558f = new L0();
        this.f75561i = new C8811n1[0];
        this.f75565m = -1L;
        this.f75566n = -1L;
        this.f75564l = -1;
        this.f75560h = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
