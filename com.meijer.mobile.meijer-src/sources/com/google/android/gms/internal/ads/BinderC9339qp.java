package com.google.android.gms.internal.ads;

import ad.AbstractC5683c;
import ad.AbstractC5684d;

/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9339qp extends AbstractBinderC8484ip {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5684d f78681a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5683c f78682b;

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void b(Oc.W0 w02) {
        if (this.f78681a != null) {
            this.f78681a.a(w02.T());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zzg() {
        AbstractC5684d abstractC5684d = this.f78681a;
        if (abstractC5684d != null) {
            abstractC5684d.b(this.f78682b);
        }
    }

    public BinderC9339qp(AbstractC5684d abstractC5684d, AbstractC5683c abstractC5683c) {
        this.f78681a = abstractC5684d;
        this.f78682b = abstractC5683c;
    }
}
