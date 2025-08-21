package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes6.dex */
final class E40 implements InterfaceC9533sf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J40 f67182a;

    E40(J40 j40) {
        this.f67182a = j40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        Sc.p.e("", (zzdyh) obj);
        Rc.p0.k("Failed to get a cache key, reverting to legacy flow.");
        J40 j40 = this.f67182a;
        j40.f68605d = new G40(null, j40.e(), null);
        return this.f67182a.f68605d;
    }
}
