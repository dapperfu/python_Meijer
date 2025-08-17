package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.rD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9262rD implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f77964a;

    @Override // java.lang.Runnable
    public final void run() {
        C9583uD c9583uD = (C9583uD) this.f77964a.get();
        if (c9583uD != null) {
            c9583uD.K0(new VE() { // from class: com.google.android.gms.internal.ads.pD
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) {
                    ((InterfaceC8942oD) obj).zza();
                }
            });
        }
    }
}
