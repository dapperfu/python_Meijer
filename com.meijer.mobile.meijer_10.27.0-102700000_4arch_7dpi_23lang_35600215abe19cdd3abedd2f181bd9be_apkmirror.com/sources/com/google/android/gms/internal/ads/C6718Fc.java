package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;

/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6718Fc implements AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6752Gc f66834a;

    C6718Fc(C6752Gc c6752Gc) {
        this.f66834a = c6752Gc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) {
        synchronized (this.f66834a.f67252c) {
            try {
                this.f66834a.f67255f = null;
                C6752Gc c6752Gc = this.f66834a;
                if (c6752Gc.f67253d != null) {
                    c6752Gc.f67253d = null;
                }
                this.f66834a.f67252c.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
