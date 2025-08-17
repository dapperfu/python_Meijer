package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.tW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9500tW {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8522kH f78589a;

    public C9500tW(AbstractC8522kH abstractC8522kH) {
        this.f78589a = abstractC8522kH;
    }

    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, View view, C8966oW c8966oW) {
        C9286rW c9286rW = new C9286rW(this, new InterfaceC9377sH() { // from class: com.google.android.gms.internal.ads.qW
            @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
            public final void a(boolean z10, Context context, C8833nC c8833nC) {
            }
        });
        GG ggC = this.f78589a.c(new C7154Rz(c8608l60, z50, null), c9286rW);
        c8966oW.a(new C9393sW(this, ggC));
        return ggC.i();
    }
}
