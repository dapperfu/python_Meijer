package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8257hr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f74794a;

    RunnableC8257hr(zzcaw zzcawVar) {
        this.f74794a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f74794a;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.zzh();
        }
    }
}
