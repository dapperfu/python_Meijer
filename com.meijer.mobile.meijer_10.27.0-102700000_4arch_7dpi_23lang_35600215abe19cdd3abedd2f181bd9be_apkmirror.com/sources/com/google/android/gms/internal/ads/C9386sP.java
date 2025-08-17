package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9386sP extends Yc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78235a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78236b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC9921xP f78237c;

    C9386sP(BinderC9921xP binderC9921xP, String str, String str2) {
        this.f78235a = str;
        this.f78236b = str2;
        this.f78237c = binderC9921xP;
    }

    @Override // Ec.d
    public final void a(Ec.h hVar) {
        this.f78237c.L9(BinderC9921xP.K9(hVar), this.f78236b);
    }

    @Override // Ec.d
    public final /* bridge */ /* synthetic */ void b(Yc.c cVar) {
        String str = this.f78236b;
        this.f78237c.F9(this.f78235a, cVar, str);
    }
}
