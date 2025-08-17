package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8043fr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f74183a;

    RunnableC8043fr(zzcaw zzcawVar) {
        this.f74183a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f74183a;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.zza();
        }
    }
}
