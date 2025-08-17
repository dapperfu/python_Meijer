package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.sD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9369sD implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f78187a;

    @Override // java.lang.Runnable
    public final void run() {
        C9583uD c9583uD = (C9583uD) this.f78187a.get();
        if (c9583uD != null) {
            c9583uD.K0(new VE() { // from class: com.google.android.gms.internal.ads.qD
                @Override // com.google.android.gms.internal.ads.VE
                public final void zza(Object obj) throws ExecutionException, InterruptedException {
                    ((InterfaceC8942oD) obj).zzb();
                }
            });
        }
    }
}
