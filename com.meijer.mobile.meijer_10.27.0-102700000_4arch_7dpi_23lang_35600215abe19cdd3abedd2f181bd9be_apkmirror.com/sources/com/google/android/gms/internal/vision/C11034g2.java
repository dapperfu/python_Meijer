package com.google.android.gms.internal.vision;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.g2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11034g2 extends AbstractC11030f2<C11038h2, C11038h2> {
    private static void m(Object obj, C11038h2 c11038h2) {
        ((O0) obj).zzb = c11038h2;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ void b(C11038h2 c11038h2, int i10, long j10) {
        c11038h2.c(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ void c(C11038h2 c11038h2, int i10, AbstractC11036h0 abstractC11036h0) {
        c11038h2.c((i10 << 3) | 2, abstractC11036h0);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ void d(C11038h2 c11038h2, C2 c22) throws IOException {
        c11038h2.h(c22);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* bridge */ /* synthetic */ void e(Object obj, C11038h2 c11038h2) {
        m(obj, c11038h2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ C11038h2 f(Object obj) {
        return ((O0) obj).zzb;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ void g(C11038h2 c11038h2, C2 c22) throws IOException {
        c11038h2.e(c22);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ void h(Object obj, C11038h2 c11038h2) {
        m(obj, c11038h2);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ C11038h2 i(C11038h2 c11038h2, C11038h2 c11038h22) {
        C11038h2 c11038h23 = c11038h2;
        C11038h2 c11038h24 = c11038h22;
        return c11038h24.equals(C11038h2.a()) ? c11038h23 : C11038h2.b(c11038h23, c11038h24);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final void j(Object obj) {
        ((O0) obj).zzb.i();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ int k(C11038h2 c11038h2) {
        return c11038h2.j();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ int l(C11038h2 c11038h2) {
        return c11038h2.k();
    }

    C11034g2() {
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11030f2
    final /* synthetic */ C11038h2 a() {
        return C11038h2.g();
    }
}
