package com.google.android.gms.internal.ads;

import ad.AbstractC5683c;
import ad.AbstractC5684d;

/* renamed from: com.google.android.gms.internal.ads.sP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9511sP extends AbstractC5684d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f79075a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f79076b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC10046xP f79077c;

    C9511sP(BinderC10046xP binderC10046xP, String str, String str2) {
        this.f79075a = str;
        this.f79076b = str2;
        this.f79077c = binderC10046xP;
    }

    @Override // Gc.d
    public final void a(Gc.h hVar) {
        this.f79077c.L9(BinderC10046xP.K9(hVar), this.f79076b);
    }

    @Override // Gc.d
    public final /* bridge */ /* synthetic */ void b(AbstractC5683c abstractC5683c) {
        String str = this.f79076b;
        this.f79077c.F9(this.f79075a, abstractC5683c, str);
    }
}
