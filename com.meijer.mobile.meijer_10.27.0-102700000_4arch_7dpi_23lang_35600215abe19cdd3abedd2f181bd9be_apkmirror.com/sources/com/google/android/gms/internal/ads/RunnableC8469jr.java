package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8469jr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f75526a;

    RunnableC8469jr(zzcaw zzcawVar) {
        this.f75526a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75526a;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.zzd();
            this.f75526a.f80596p.zzi();
        }
    }
}
