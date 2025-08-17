package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdView;

/* renamed from: com.google.android.gms.internal.ads.qP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9173qP extends Ec.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f77777a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AdView f77778b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f77779c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC9921xP f77780d;

    C9173qP(BinderC9921xP binderC9921xP, String str, AdView adView, String str2) {
        this.f77777a = str;
        this.f77778b = adView;
        this.f77779c = str2;
        this.f77780d = binderC9921xP;
    }

    @Override // Ec.c
    public final void J() {
        this.f77780d.F9(this.f77777a, this.f77778b, this.f77779c);
    }

    @Override // Ec.c
    public final void q(Ec.h hVar) {
        this.f77780d.L9(BinderC9921xP.K9(hVar), this.f77779c);
    }
}
