package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.rD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9387rD implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f78804a;

    @Override // java.lang.Runnable
    public final void run() {
        C9708uD c9708uD = (C9708uD) this.f78804a.get();
        if (c9708uD != null) {
            c9708uD.J0(new VE() { // from class: com.google.android.gms.internal.ads.pD
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) {
                    ((InterfaceC9067oD) obj).zza();
                }
            });
        }
    }
}
