package com.google.android.gms.internal.ads;

import bd.AbstractC6355a;
import bd.AbstractC6356b;

/* renamed from: com.google.android.gms.internal.ads.tP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9618tP extends AbstractC6356b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f79406a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f79407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC10046xP f79408c;

    C9618tP(BinderC10046xP binderC10046xP, String str, String str2) {
        this.f79406a = str;
        this.f79407b = str2;
        this.f79408c = binderC10046xP;
    }

    @Override // Gc.d
    public final void a(Gc.h hVar) {
        this.f79408c.L9(BinderC10046xP.K9(hVar), this.f79407b);
    }

    @Override // Gc.d
    public final /* bridge */ /* synthetic */ void b(AbstractC6355a abstractC6355a) {
        String str = this.f79407b;
        this.f79408c.F9(this.f79406a, abstractC6355a, str);
    }
}
