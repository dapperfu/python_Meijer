package com.google.android.gms.internal.pal;

import java.io.IOException;

/* loaded from: classes6.dex */
final class L1 extends J1 {
    L1() {
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ Object f() {
        return K1.e();
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ Object g(Object obj) {
        ((K1) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.J1
    final boolean r(InterfaceC10990r1 interfaceC10990r1) {
        return false;
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ int a(Object obj) {
        return ((K1) obj).a();
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ int b(Object obj) {
        return ((K1) obj).b();
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        B0 b02 = (B0) obj;
        K1 k12 = b02.zzc;
        if (k12 != K1.c()) {
            return k12;
        }
        K1 k1E = K1.e();
        b02.zzc = k1E;
        return k1E;
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ Object d(Object obj) {
        return ((B0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ void j(Object obj, int i10, Object obj2) {
        ((K1) obj).h((i10 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ void k(Object obj, int i10, AbstractC10730b0 abstractC10730b0) {
        ((K1) obj).h((i10 << 3) | 2, abstractC10730b0);
    }

    @Override // com.google.android.gms.internal.pal.J1
    final void m(Object obj) {
        ((B0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ void n(Object obj, Object obj2) {
        ((B0) obj).zzc = (K1) obj2;
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ void o(Object obj, Object obj2) {
        ((B0) obj).zzc = (K1) obj2;
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* synthetic */ void p(Object obj, InterfaceC10749c2 interfaceC10749c2) throws IOException {
        ((K1) obj).i(interfaceC10749c2);
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        K1 k12 = (K1) obj2;
        if (k12.equals(K1.c())) {
            return obj;
        }
        return K1.d((K1) obj, k12);
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ void h(Object obj, int i10, int i11) {
        ((K1) obj).h((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ void i(Object obj, int i10, long j10) {
        ((K1) obj).h((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.pal.J1
    final /* bridge */ /* synthetic */ void l(Object obj, int i10, long j10) {
        ((K1) obj).h(i10 << 3, Long.valueOf(j10));
    }
}
