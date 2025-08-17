package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9279rP extends Rc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78008a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78009b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC9921xP f78010c;

    C9279rP(BinderC9921xP binderC9921xP, String str, String str2) {
        this.f78008a = str;
        this.f78009b = str2;
        this.f78010c = binderC9921xP;
    }

    @Override // Ec.d
    public final void a(Ec.h hVar) {
        this.f78010c.L9(BinderC9921xP.K9(hVar), this.f78009b);
    }

    @Override // Ec.d
    public final /* bridge */ /* synthetic */ void b(Rc.a aVar) {
        String str = this.f78009b;
        this.f78010c.F9(this.f78008a, aVar, str);
    }
}
