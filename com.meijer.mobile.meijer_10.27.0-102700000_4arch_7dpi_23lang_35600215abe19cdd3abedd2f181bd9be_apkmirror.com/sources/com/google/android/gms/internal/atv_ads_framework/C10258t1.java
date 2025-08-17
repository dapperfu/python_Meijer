package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10258t1 implements InterfaceC10276z1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10247p1 f81056a;

    /* renamed from: b, reason: collision with root package name */
    private final Q1 f81057b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f81058c;

    /* renamed from: d, reason: collision with root package name */
    private final A0 f81059d;

    private C10258t1(Q1 q12, A0 a02, InterfaceC10247p1 interfaceC10247p1) {
        this.f81057b = q12;
        this.f81058c = a02.c(interfaceC10247p1);
        this.f81059d = a02;
        this.f81056a = interfaceC10247p1;
    }

    static C10258t1 d(Q1 q12, A0 a02, InterfaceC10247p1 interfaceC10247p1) {
        return new C10258t1(q12, a02, interfaceC10247p1);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final void a(Object obj) {
        this.f81057b.e(obj);
        this.f81059d.b(obj);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final void b(Object obj, i2 i2Var) throws IOException {
        this.f81059d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final void c(Object obj, Object obj2) {
        C1.a(this.f81057b, obj, obj2);
        if (this.f81058c) {
            this.f81059d.a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final int zza(Object obj) {
        Q1 q12 = this.f81057b;
        int iB = q12.b(q12.c(obj));
        if (!this.f81058c) {
            return iB;
        }
        this.f81059d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final int zzb(Object obj) {
        int iHashCode = this.f81057b.c(obj).hashCode();
        if (!this.f81058c) {
            return iHashCode;
        }
        this.f81059d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final Object zzc() {
        InterfaceC10247p1 interfaceC10247p1 = this.f81056a;
        return interfaceC10247p1 instanceof K0 ? ((K0) interfaceC10247p1).i() : interfaceC10247p1.zzs().zzk();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final boolean zzg(Object obj, Object obj2) {
        if (!this.f81057b.c(obj).equals(this.f81057b.c(obj2))) {
            return false;
        }
        if (!this.f81058c) {
            return true;
        }
        this.f81059d.a(obj);
        this.f81059d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10276z1
    public final boolean zzh(Object obj) {
        this.f81059d.a(obj);
        throw null;
    }
}
