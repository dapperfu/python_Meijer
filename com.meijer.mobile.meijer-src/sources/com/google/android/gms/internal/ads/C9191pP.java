package com.google.android.gms.internal.ads;

import Ic.a;

/* renamed from: com.google.android.gms.internal.ads.pP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9191pP extends a.AbstractC0230a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78417a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f78418b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC10046xP f78419c;

    C9191pP(BinderC10046xP binderC10046xP, String str, String str2) {
        this.f78417a = str;
        this.f78418b = str2;
        this.f78419c = binderC10046xP;
    }

    @Override // Gc.d
    public final void a(Gc.h hVar) {
        this.f78419c.L9(BinderC10046xP.K9(hVar), this.f78418b);
    }

    @Override // Gc.d
    public final /* bridge */ /* synthetic */ void b(Ic.a aVar) {
        String str = this.f78418b;
        this.f78419c.F9(this.f78417a, aVar, str);
    }
}
