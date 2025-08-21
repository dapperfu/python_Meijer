package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9877vr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f79981a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzcbg f79982b;

    RunnableC9877vr(zzcbg zzcbgVar, boolean z10) {
        this.f79981a = z10;
        this.f79982b = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79982b.m("windowVisibilityChanged", "isVisible", String.valueOf(this.f79981a));
    }
}
