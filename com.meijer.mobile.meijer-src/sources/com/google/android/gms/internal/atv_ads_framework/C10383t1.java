package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10383t1 implements InterfaceC10401z1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10372p1 f81896a;

    /* renamed from: b, reason: collision with root package name */
    private final Q1 f81897b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f81898c;

    /* renamed from: d, reason: collision with root package name */
    private final A0 f81899d;

    private C10383t1(Q1 q12, A0 a02, InterfaceC10372p1 interfaceC10372p1) {
        this.f81897b = q12;
        this.f81898c = a02.c(interfaceC10372p1);
        this.f81899d = a02;
        this.f81896a = interfaceC10372p1;
    }

    static C10383t1 d(Q1 q12, A0 a02, InterfaceC10372p1 interfaceC10372p1) {
        return new C10383t1(q12, a02, interfaceC10372p1);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final void a(Object obj) {
        this.f81897b.e(obj);
        this.f81899d.b(obj);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final void b(Object obj, i2 i2Var) throws IOException {
        this.f81899d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final void c(Object obj, Object obj2) {
        C1.a(this.f81897b, obj, obj2);
        if (this.f81898c) {
            this.f81899d.a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final int zza(Object obj) {
        Q1 q12 = this.f81897b;
        int iB = q12.b(q12.c(obj));
        if (!this.f81898c) {
            return iB;
        }
        this.f81899d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final int zzb(Object obj) {
        int iHashCode = this.f81897b.c(obj).hashCode();
        if (!this.f81898c) {
            return iHashCode;
        }
        this.f81899d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final Object zzc() {
        InterfaceC10372p1 interfaceC10372p1 = this.f81896a;
        return interfaceC10372p1 instanceof K0 ? ((K0) interfaceC10372p1).i() : interfaceC10372p1.zzs().zzk();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final boolean zzg(Object obj, Object obj2) {
        if (!this.f81897b.c(obj).equals(this.f81897b.c(obj2))) {
            return false;
        }
        if (!this.f81898c) {
            return true;
        }
        this.f81899d.a(obj);
        this.f81899d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10401z1
    public final boolean zzh(Object obj) {
        this.f81899d.a(obj);
        throw null;
    }
}
