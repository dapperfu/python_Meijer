package com.google.android.gms.internal.vision;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11159g2 extends AbstractC11155f2<C11163h2, C11163h2> {
    private static void m(Object obj, C11163h2 c11163h2) {
        ((O0) obj).zzb = c11163h2;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ void b(C11163h2 c11163h2, int i10, long j10) {
        c11163h2.c(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ void c(C11163h2 c11163h2, int i10, AbstractC11161h0 abstractC11161h0) {
        c11163h2.c((i10 << 3) | 2, abstractC11161h0);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ void d(C11163h2 c11163h2, C2 c22) throws IOException {
        c11163h2.h(c22);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* bridge */ /* synthetic */ void e(Object obj, C11163h2 c11163h2) {
        m(obj, c11163h2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ C11163h2 f(Object obj) {
        return ((O0) obj).zzb;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ void g(C11163h2 c11163h2, C2 c22) throws IOException {
        c11163h2.e(c22);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ void h(Object obj, C11163h2 c11163h2) {
        m(obj, c11163h2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ C11163h2 i(C11163h2 c11163h2, C11163h2 c11163h22) {
        C11163h2 c11163h23 = c11163h2;
        C11163h2 c11163h24 = c11163h22;
        return c11163h24.equals(C11163h2.a()) ? c11163h23 : C11163h2.b(c11163h23, c11163h24);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final void j(Object obj) {
        ((O0) obj).zzb.i();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ int k(C11163h2 c11163h2) {
        return c11163h2.j();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ int l(C11163h2 c11163h2) {
        return c11163h2.k();
    }

    C11159g2() {
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11155f2
    final /* synthetic */ C11163h2 a() {
        return C11163h2.g();
    }
}
