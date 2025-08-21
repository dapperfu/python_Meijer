package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC6646c;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6809Ec implements AbstractC6646c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6877Gc f67328a;

    C6809Ec(C6877Gc c6877Gc) {
        this.f67328a = c6877Gc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        C6877Gc c6877Gc;
        synchronized (this.f67328a.f68092c) {
            try {
                c6877Gc = this.f67328a;
            } catch (DeadObjectException e10) {
                Sc.p.e("Unable to obtain a cache service instance.", e10);
                C6877Gc.h(this.f67328a);
            }
            if (c6877Gc.f68093d != null) {
                c6877Gc.f68095f = c6877Gc.f68093d.d();
                this.f67328a.f68092c.notifyAll();
            } else {
                this.f67328a.f68092c.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) {
        synchronized (this.f67328a.f68092c) {
            this.f67328a.f68095f = null;
            this.f67328a.f68092c.notifyAll();
        }
    }
}
