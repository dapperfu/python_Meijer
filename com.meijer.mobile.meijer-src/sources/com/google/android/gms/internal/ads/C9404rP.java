package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9404rP extends Tc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78849b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC10046xP f78850c;

    C9404rP(BinderC10046xP binderC10046xP, String str, String str2) {
        this.f78848a = str;
        this.f78849b = str2;
        this.f78850c = binderC10046xP;
    }

    @Override // Gc.d
    public final void a(Gc.h hVar) {
        this.f78850c.L9(BinderC10046xP.K9(hVar), this.f78849b);
    }

    @Override // Gc.d
    public final /* bridge */ /* synthetic */ void b(Tc.a aVar) {
        String str = this.f78849b;
        this.f78850c.F9(this.f78848a, aVar, str);
    }
}
