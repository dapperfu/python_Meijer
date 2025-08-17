package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9493tP extends Zc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78566a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78567b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC9921xP f78568c;

    C9493tP(BinderC9921xP binderC9921xP, String str, String str2) {
        this.f78566a = str;
        this.f78567b = str2;
        this.f78568c = binderC9921xP;
    }

    @Override // Ec.d
    public final void a(Ec.h hVar) {
        this.f78568c.L9(BinderC9921xP.K9(hVar), this.f78567b);
    }

    @Override // Ec.d
    public final /* bridge */ /* synthetic */ void b(Zc.a aVar) {
        String str = this.f78567b;
        this.f78568c.F9(this.f78566a, aVar, str);
    }
}
