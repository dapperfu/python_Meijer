package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Mf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7087Mf0 implements InterfaceC7291Sf0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC9320qf0 f69521a;

    C7087Mf0(AbstractC9320qf0 abstractC9320qf0) {
        this.f69521a = abstractC9320qf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7291Sf0
    public final /* bridge */ /* synthetic */ Iterator a(C7325Tf0 c7325Tf0, CharSequence charSequence) {
        return new C7054Lf0(this, c7325Tf0, charSequence, this.f69521a.a(charSequence));
    }
}
