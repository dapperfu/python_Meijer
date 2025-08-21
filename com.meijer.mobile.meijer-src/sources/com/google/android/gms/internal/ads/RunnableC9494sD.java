package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.sD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9494sD implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f79027a;

    @Override // java.lang.Runnable
    public final void run() {
        C9708uD c9708uD = (C9708uD) this.f79027a.get();
        if (c9708uD != null) {
            c9708uD.J0(new VE() { // from class: com.google.android.gms.internal.ads.qD
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) throws ExecutionException, InterruptedException {
                    ((InterfaceC9067oD) obj).zzb();
                }
            });
        }
    }
}
