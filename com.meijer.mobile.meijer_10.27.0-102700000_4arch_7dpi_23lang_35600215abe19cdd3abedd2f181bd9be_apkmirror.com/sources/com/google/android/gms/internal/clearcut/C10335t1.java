package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10335t1 extends AbstractC10329r1<C10332s1, C10332s1> {
    C10335t1() {
    }

    private static void m(Object obj, C10332s1 c10332s1) {
        ((AbstractC10293f0) obj).zzjp = c10332s1;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ void a(C10332s1 c10332s1, int i10, long j10) {
        c10332s1.e(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ void b(C10332s1 c10332s1, int i10, A a10) {
        c10332s1.e((i10 << 3) | 2, a10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ void c(C10332s1 c10332s1, M1 m12) throws IOException {
        c10332s1.g(m12);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final void d(Object obj) {
        ((AbstractC10293f0) obj).zzjp.k();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ void e(C10332s1 c10332s1, M1 m12) throws IOException {
        c10332s1.b(m12);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ C10332s1 f() {
        return C10332s1.i();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ void g(Object obj, C10332s1 c10332s1) {
        m(obj, c10332s1);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ void h(Object obj, C10332s1 c10332s1) {
        m(obj, c10332s1);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ C10332s1 i(C10332s1 c10332s1, C10332s1 c10332s12) {
        C10332s1 c10332s13 = c10332s1;
        C10332s1 c10332s14 = c10332s12;
        return c10332s14.equals(C10332s1.h()) ? c10332s13 : C10332s1.a(c10332s13, c10332s14);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ int j(C10332s1 c10332s1) {
        return c10332s1.d();
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ C10332s1 k(Object obj) {
        return ((AbstractC10293f0) obj).zzjp;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10329r1
    final /* synthetic */ int l(C10332s1 c10332s1) {
        return c10332s1.j();
    }
}
