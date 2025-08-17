package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
final class G1 implements InterfaceC9130q0 {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC9450t0 f67052b;

    /* renamed from: c, reason: collision with root package name */
    private int f67053c;

    /* renamed from: d, reason: collision with root package name */
    private int f67054d;

    /* renamed from: e, reason: collision with root package name */
    private int f67055e;

    /* renamed from: g, reason: collision with root package name */
    private B2 f67057g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC9236r0 f67058h;

    /* renamed from: i, reason: collision with root package name */
    private J1 f67059i;

    /* renamed from: j, reason: collision with root package name */
    private D3 f67060j;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f67051a = new GQ(6);

    /* renamed from: f, reason: collision with root package name */
    private long f67056f = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f67052b = interfaceC9450t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    private final int e(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        this.f67051a.i(2);
        ((C7955f0) interfaceC9236r0).c(this.f67051a.n(), 0, 2, false);
        return this.f67051a.G();
    }

    private final void f() {
        InterfaceC9450t0 interfaceC9450t0 = this.f67052b;
        interfaceC9450t0.getClass();
        interfaceC9450t0.e();
        this.f67052b.m(new P0(-9223372036854775807L, 0L));
        this.f67053c = 6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f67053c = 0;
            this.f67060j = null;
        } else if (this.f67053c == 5) {
            D3 d32 = this.f67060j;
            d32.getClass();
            d32.a(j10, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9236r0 r24, com.google.android.gms.internal.ads.N0 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.G1.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        if (e(interfaceC9236r0) != 65496) {
            return false;
        }
        int iE = e(interfaceC9236r0);
        this.f67054d = iE;
        if (iE == 65504) {
            this.f67051a.i(2);
            C7955f0 c7955f0 = (C7955f0) interfaceC9236r0;
            c7955f0.c(this.f67051a.n(), 0, 2, false);
            c7955f0.h(this.f67051a.G() - 2, false);
            iE = e(interfaceC9236r0);
            this.f67054d = iE;
        }
        if (iE == 65505) {
            C7955f0 c7955f02 = (C7955f0) interfaceC9236r0;
            c7955f02.h(2, false);
            this.f67051a.i(6);
            c7955f02.c(this.f67051a.n(), 0, 6, false);
            if (this.f67051a.K() == 1165519206 && this.f67051a.G() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
