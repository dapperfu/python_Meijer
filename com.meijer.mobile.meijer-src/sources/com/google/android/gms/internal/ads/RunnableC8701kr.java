package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8701kr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzcaw f76548a;

    RunnableC8701kr(zzcaw zzcawVar) {
        this.f76548a = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.f76548a;
        if (zzcawVar.f81436p != null) {
            if (!zzcawVar.f81437q) {
                zzcawVar.f81436p.zzg();
                this.f76548a.f81437q = true;
            }
            this.f76548a.f81436p.zze();
        }
    }
}
