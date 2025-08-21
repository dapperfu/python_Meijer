package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10460t1 extends AbstractC10454r1<C10457s1, C10457s1> {
    C10460t1() {
    }

    private static void m(Object obj, C10457s1 c10457s1) {
        ((AbstractC10418f0) obj).zzjp = c10457s1;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ void a(C10457s1 c10457s1, int i10, long j10) {
        c10457s1.e(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ void b(C10457s1 c10457s1, int i10, A a10) {
        c10457s1.e((i10 << 3) | 2, a10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ void c(C10457s1 c10457s1, M1 m12) throws IOException {
        c10457s1.g(m12);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final void d(Object obj) {
        ((AbstractC10418f0) obj).zzjp.k();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ void e(C10457s1 c10457s1, M1 m12) throws IOException {
        c10457s1.b(m12);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ C10457s1 f() {
        return C10457s1.i();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ void g(Object obj, C10457s1 c10457s1) {
        m(obj, c10457s1);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ void h(Object obj, C10457s1 c10457s1) {
        m(obj, c10457s1);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ C10457s1 i(C10457s1 c10457s1, C10457s1 c10457s12) {
        C10457s1 c10457s13 = c10457s1;
        C10457s1 c10457s14 = c10457s12;
        return c10457s14.equals(C10457s1.h()) ? c10457s13 : C10457s1.a(c10457s13, c10457s14);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ int j(C10457s1 c10457s1) {
        return c10457s1.d();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ C10457s1 k(Object obj) {
        return ((AbstractC10418f0) obj).zzjp;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10454r1
    final /* synthetic */ int l(C10457s1 c10457s1) {
        return c10457s1.j();
    }
}
