package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8168fr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f75023a;

    RunnableC8168fr(zzcaw zzcawVar) {
        this.f75023a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75023a;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.zza();
        }
    }
}
