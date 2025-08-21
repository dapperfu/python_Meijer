package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* renamed from: com.google.android.gms.internal.ads.er, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8061er implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f74782a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzcaw f74783b;

    RunnableC8061er(zzcaw zzcawVar, MediaPlayer mediaPlayer) {
        this.f74782a = mediaPlayer;
        this.f74783b = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzcaw.J(this.f74783b, this.f74782a);
        zzcaw zzcawVar = this.f74783b;
        if (zzcawVar.f81436p != null) {
            zzcawVar.f81436p.zzf();
        }
    }
}
