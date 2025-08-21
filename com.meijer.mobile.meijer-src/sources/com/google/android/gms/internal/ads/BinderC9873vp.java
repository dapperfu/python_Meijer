package com.google.android.gms.internal.ads;

import bd.AbstractC6356b;

/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9873vp extends AbstractBinderC8484ip {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6356b f79972a;

    /* renamed from: b, reason: collision with root package name */
    private final C9980wp f79973b;

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void b(Oc.W0 w02) {
        AbstractC6356b abstractC6356b = this.f79972a;
        if (abstractC6356b != null) {
            abstractC6356b.a(w02.T());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zzg() {
        C9980wp c9980wp;
        AbstractC6356b abstractC6356b = this.f79972a;
        if (abstractC6356b == null || (c9980wp = this.f79973b) == null) {
            return;
        }
        abstractC6356b.b(c9980wp);
    }

    public BinderC9873vp(AbstractC6356b abstractC6356b, C9980wp c9980wp) {
        this.f79972a = abstractC6356b;
        this.f79973b = c9980wp;
    }
}
