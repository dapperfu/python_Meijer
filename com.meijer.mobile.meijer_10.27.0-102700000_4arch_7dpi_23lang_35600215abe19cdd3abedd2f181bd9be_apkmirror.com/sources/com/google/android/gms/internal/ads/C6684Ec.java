package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC6521c;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6684Ec implements AbstractC6521c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6752Gc f66488a;

    C6684Ec(C6752Gc c6752Gc) {
        this.f66488a = c6752Gc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        C6752Gc c6752Gc;
        synchronized (this.f66488a.f67252c) {
            try {
                c6752Gc = this.f66488a;
            } catch (DeadObjectException e10) {
                Qc.p.e("Unable to obtain a cache service instance.", e10);
                C6752Gc.h(this.f66488a);
            }
            if (c6752Gc.f67253d != null) {
                c6752Gc.f67255f = c6752Gc.f67253d.d();
                this.f66488a.f67252c.notifyAll();
            } else {
                this.f66488a.f67252c.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) {
        synchronized (this.f66488a.f67252c) {
            this.f66488a.f67255f = null;
            this.f66488a.f67252c.notifyAll();
        }
    }
}
