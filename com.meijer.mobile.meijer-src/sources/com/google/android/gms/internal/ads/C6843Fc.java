package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;

/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6843Fc implements AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6877Gc f67674a;

    C6843Fc(C6877Gc c6877Gc) {
        this.f67674a = c6877Gc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) {
        synchronized (this.f67674a.f68092c) {
            try {
                this.f67674a.f68095f = null;
                C6877Gc c6877Gc = this.f67674a;
                if (c6877Gc.f68093d != null) {
                    c6877Gc.f68093d = null;
                }
                this.f67674a.f68092c.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
