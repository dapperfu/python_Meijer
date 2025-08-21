package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8382hr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f75634a;

    RunnableC8382hr(zzcaw zzcawVar) {
        this.f75634a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f75634a;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.zzh();
        }
    }
}
