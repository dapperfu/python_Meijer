package com.google.android.gms.internal.ads;

import Gc.a;

/* renamed from: com.google.android.gms.internal.ads.pP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9066pP extends a.AbstractC0161a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77577a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f77578b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC9921xP f77579c;

    C9066pP(BinderC9921xP binderC9921xP, String str, String str2) {
        this.f77577a = str;
        this.f77578b = str2;
        this.f77579c = binderC9921xP;
    }

    @Override // Ec.d
    public final void a(Ec.h hVar) {
        this.f77579c.L9(BinderC9921xP.K9(hVar), this.f77578b);
    }

    @Override // Ec.d
    public final /* bridge */ /* synthetic */ void b(Gc.a aVar) {
        String str = this.f77578b;
        this.f77579c.F9(this.f77577a, aVar, str);
    }
}
