package com.google.android.gms.common.internal;

import android.os.Bundle;
import gd.C14243b;

/* loaded from: classes4.dex */
public final class g0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC6521c f64880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC6521c abstractC6521c, int i10, Bundle bundle) {
        super(abstractC6521c, i10, bundle);
        this.f64880g = abstractC6521c;
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final void f(C14243b c14243b) {
        if (this.f64880g.enableLocalFallback() && AbstractC6521c.zzo(this.f64880g)) {
            AbstractC6521c.zzk(this.f64880g, 16);
        } else {
            this.f64880g.zzc.b(c14243b);
            this.f64880g.onConnectionFailed(c14243b);
        }
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final boolean g() {
        this.f64880g.zzc.b(C14243b.f133305e);
        return true;
    }
}
