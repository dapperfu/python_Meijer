package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdView;

/* renamed from: com.google.android.gms.internal.ads.qP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9298qP extends Gc.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AdView f78618b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f78619c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC10046xP f78620d;

    C9298qP(BinderC10046xP binderC10046xP, String str, AdView adView, String str2) {
        this.f78617a = str;
        this.f78618b = adView;
        this.f78619c = str2;
        this.f78620d = binderC10046xP;
    }

    @Override // Gc.c
    public final void J() {
        this.f78620d.F9(this.f78617a, this.f78618b, this.f78619c);
    }

    @Override // Gc.c
    public final void q(Gc.h hVar) {
        this.f78620d.L9(BinderC10046xP.K9(hVar), this.f78619c);
    }
}
