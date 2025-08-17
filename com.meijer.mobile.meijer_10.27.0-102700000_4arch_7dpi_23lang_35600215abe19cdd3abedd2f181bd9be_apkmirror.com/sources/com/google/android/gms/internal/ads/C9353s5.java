package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9353s5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f78131a;

    /* renamed from: c, reason: collision with root package name */
    private final String f78133c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78134d;

    /* renamed from: e, reason: collision with root package name */
    private String f78135e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f78136f;

    /* renamed from: h, reason: collision with root package name */
    private int f78138h;

    /* renamed from: i, reason: collision with root package name */
    private int f78139i;

    /* renamed from: j, reason: collision with root package name */
    private long f78140j;

    /* renamed from: k, reason: collision with root package name */
    private C f78141k;

    /* renamed from: l, reason: collision with root package name */
    private int f78142l;

    /* renamed from: m, reason: collision with root package name */
    private int f78143m;

    /* renamed from: g, reason: collision with root package name */
    private int f78137g = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f78146p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f78132b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    private int f78144n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f78145o = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f78146p = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f78137g = 0;
        this.f78138h = 0;
        this.f78139i = 0;
        this.f78146p = -9223372036854775807L;
        this.f78132b.set(0);
    }

    private final void d(C8809n0 c8809n0) {
        int i10;
        int i11 = c8809n0.f76960b;
        if (i11 == -2147483647 || (i10 = c8809n0.f76961c) == -1) {
            return;
        }
        C c10 = this.f78141k;
        if (c10 != null && i10 == c10.f65641D && i11 == c10.f65642E && Objects.equals(c8809n0.f76959a, c10.f65664o)) {
            return;
        }
        C c11 = this.f78141k;
        C9592uH0 c9592uH0 = c11 == null ? new C9592uH0() : c11.b();
        c9592uH0.m(this.f78135e);
        c9592uH0.B(c8809n0.f76959a);
        c9592uH0.r0(c8809n0.f76961c);
        c9592uH0.C(c8809n0.f76960b);
        c9592uH0.q(this.f78133c);
        c9592uH0.y(this.f78134d);
        C cH = c9592uH0.H();
        this.f78141k = cH;
        this.f78136f.d(cH);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r20) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9353s5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    public C9353s5(String str, int i10, int i11) {
        this.f78131a = new GQ(new byte[i11]);
        this.f78133c = str;
        this.f78134d = i10;
    }

    private final boolean e(GQ gq2, byte[] bArr, int i10) {
        int iMin = Math.min(gq2.r(), i10 - this.f78138h);
        gq2.h(bArr, this.f78138h, iMin);
        int i11 = this.f78138h + iMin;
        this.f78138h = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f78135e = c8393j6.b();
        this.f78136f = interfaceC9450t0.a(c8393j6.a(), 1);
    }
}
