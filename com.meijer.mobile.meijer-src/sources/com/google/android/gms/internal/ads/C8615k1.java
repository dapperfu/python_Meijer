package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8615k1 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f76393a;

    /* renamed from: b, reason: collision with root package name */
    private final C8403i1 f76394b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76395c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8835m4 f76396d;

    /* renamed from: e, reason: collision with root package name */
    private int f76397e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9575t0 f76398f;

    /* renamed from: g, reason: collision with root package name */
    private C8722l1 f76399g;

    /* renamed from: h, reason: collision with root package name */
    private long f76400h;

    /* renamed from: i, reason: collision with root package name */
    private C8936n1[] f76401i;

    /* renamed from: j, reason: collision with root package name */
    private long f76402j;

    /* renamed from: k, reason: collision with root package name */
    private C8936n1 f76403k;

    /* renamed from: l, reason: collision with root package name */
    private int f76404l;

    /* renamed from: m, reason: collision with root package name */
    private long f76405m;

    /* renamed from: n, reason: collision with root package name */
    private long f76406n;

    /* renamed from: o, reason: collision with root package name */
    private int f76407o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f76408p;

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f76397e = 0;
        if (this.f76395c) {
            interfaceC9575t0 = new C9156p4(interfaceC9575t0, this.f76396d);
        }
        this.f76398f = interfaceC9575t0;
        this.f76402j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    private final C8936n1 f(int i10) {
        for (C8936n1 c8936n1 : this.f76401i) {
            if (c8936n1.f(i10)) {
                return c8936n1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f76402j = -1L;
        this.f76403k = null;
        for (C8936n1 c8936n1 : this.f76401i) {
            c8936n1.e(j10);
        }
        if (j10 == 0) {
            this.f76397e = this.f76401i.length != 0 ? 3 : 0;
        } else {
            this.f76397e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02f5  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9361r0 r29, com.google.android.gms.internal.ads.N0 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8615k1.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        interfaceC9361r0.g(this.f76393a.n(), 0, 12);
        this.f76393a.l(0);
        if (this.f76393a.y() != 1179011410) {
            return false;
        }
        this.f76393a.m(4);
        return this.f76393a.y() == 541677121;
    }

    public C8615k1(int i10, InterfaceC8835m4 interfaceC8835m4) {
        this.f76396d = interfaceC8835m4;
        this.f76395c = 1 == (i10 ^ 1);
        this.f76393a = new GQ(12);
        this.f76394b = new C8403i1(null);
        this.f76398f = new L0();
        this.f76401i = new C8936n1[0];
        this.f76405m = -1L;
        this.f76406n = -1L;
        this.f76404l = -1;
        this.f76400h = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
