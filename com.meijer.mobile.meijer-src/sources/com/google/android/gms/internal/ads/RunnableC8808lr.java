package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8808lr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f77505a;

    RunnableC8808lr(zzcaw zzcawVar) {
        this.f77505a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f77505a;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.zzd();
        }
    }
}
