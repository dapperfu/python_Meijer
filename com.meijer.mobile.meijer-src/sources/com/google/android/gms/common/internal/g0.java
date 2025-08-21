package com.google.android.gms.common.internal;

import android.os.Bundle;
import id.C14719b;

/* loaded from: classes4.dex */
public final class g0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC6646c f65720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC6646c abstractC6646c, int i10, Bundle bundle) {
        super(abstractC6646c, i10, bundle);
        this.f65720g = abstractC6646c;
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final void f(C14719b c14719b) {
        if (this.f65720g.enableLocalFallback() && AbstractC6646c.zzo(this.f65720g)) {
            AbstractC6646c.zzk(this.f65720g, 16);
        } else {
            this.f65720g.zzc.b(c14719b);
            this.f65720g.onConnectionFailed(c14719b);
        }
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final boolean g() {
        this.f65720g.zzc.b(C14719b.f137521e);
        return true;
    }
}
