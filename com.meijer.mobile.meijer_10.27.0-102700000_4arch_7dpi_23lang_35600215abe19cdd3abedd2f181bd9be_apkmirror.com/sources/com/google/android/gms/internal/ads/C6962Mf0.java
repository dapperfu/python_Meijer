package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Mf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6962Mf0 implements InterfaceC7166Sf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC9195qf0 f68681a;

    C6962Mf0(AbstractC9195qf0 abstractC9195qf0) {
        this.f68681a = abstractC9195qf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7166Sf0
    public final /* bridge */ /* synthetic */ Iterator a(C7200Tf0 c7200Tf0, CharSequence charSequence) {
        return new C6929Lf0(this, c7200Tf0, charSequence, this.f68681a.a(charSequence));
    }
}
