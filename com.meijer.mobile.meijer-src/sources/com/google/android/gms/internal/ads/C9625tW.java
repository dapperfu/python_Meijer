package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.tW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9625tW {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8647kH f79429a;

    public C9625tW(AbstractC8647kH abstractC8647kH) {
        this.f79429a = abstractC8647kH;
    }

    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, View view, C9091oW c9091oW) {
        C9411rW c9411rW = new C9411rW(this, new InterfaceC9502sH() { // from class: com.google.android.gms.internal.ads.qW
            @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
            public final void a(boolean z10, Context context, C8958nC c8958nC) {
            }
        });
        GG ggC = this.f79429a.c(new C7279Rz(c8733l60, z50, null), c9411rW);
        c9091oW.a(new C9518sW(this, ggC));
        return ggC.i();
    }
}
