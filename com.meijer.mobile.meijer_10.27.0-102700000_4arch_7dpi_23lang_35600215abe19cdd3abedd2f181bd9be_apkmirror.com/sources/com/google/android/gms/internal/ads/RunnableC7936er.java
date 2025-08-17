package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7936er implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f73942a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzcaw f73943b;

    RunnableC7936er(zzcaw zzcawVar, MediaPlayer mediaPlayer) {
        this.f73942a = mediaPlayer;
        this.f73943b = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzcaw.J(this.f73943b, this.f73942a);
        zzcaw zzcawVar = this.f73943b;
        if (zzcawVar.f80596p != null) {
            zzcawVar.f80596p.zzf();
        }
    }
}
