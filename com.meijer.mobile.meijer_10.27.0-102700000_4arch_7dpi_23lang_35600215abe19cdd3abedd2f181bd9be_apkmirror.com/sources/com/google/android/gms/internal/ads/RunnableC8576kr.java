package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8576kr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f75708a;

    RunnableC8576kr(zzcaw zzcawVar) {
        this.f75708a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75708a;
        if (zzcawVar.f80596p != null) {
            if (!zzcawVar.f80597q) {
                zzcawVar.f80596p.zzg();
                this.f75708a.f80597q = true;
            }
            this.f75708a.f80596p.zze();
        }
    }
}
