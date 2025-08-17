package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9752vr implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f79141a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzcbg f79142b;

    RunnableC9752vr(zzcbg zzcbgVar, boolean z10) {
        this.f79141a = z10;
        this.f79142b = zzcbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79142b.m("windowVisibilityChanged", "isVisible", String.valueOf(this.f79141a));
    }
}
