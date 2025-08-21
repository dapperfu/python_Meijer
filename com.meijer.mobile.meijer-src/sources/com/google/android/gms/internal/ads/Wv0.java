package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Wv0 extends Uv0 {
    Wv0() {
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* synthetic */ Object b() {
        return Vv0.f();
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        Gu0 gu0 = (Gu0) obj;
        Vv0 vv0 = gu0.zzt;
        if (vv0 != Vv0.c()) {
            return vv0;
        }
        Vv0 vv0F = Vv0.f();
        gu0.zzt = vv0F;
        return vv0F;
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* synthetic */ Object c(Object obj) {
        Vv0 vv0 = (Vv0) obj;
        vv0.h();
        return vv0;
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* bridge */ /* synthetic */ void d(Object obj, int i10, int i11) {
        ((Vv0) obj).j((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* bridge */ /* synthetic */ void e(Object obj, int i10, long j10) {
        ((Vv0) obj).j((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* bridge */ /* synthetic */ void f(Object obj, int i10, Object obj2) {
        ((Vv0) obj).j((i10 << 3) | 3, (Vv0) obj2);
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* bridge */ /* synthetic */ void g(Object obj, int i10, Zt0 zt0) {
        ((Vv0) obj).j((i10 << 3) | 2, zt0);
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* bridge */ /* synthetic */ void h(Object obj, int i10, long j10) {
        ((Vv0) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final void i(Object obj) {
        ((Gu0) obj).zzt.h();
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    final /* synthetic */ void j(Object obj, Object obj2) {
        ((Gu0) obj).zzt = (Vv0) obj2;
    }
}
