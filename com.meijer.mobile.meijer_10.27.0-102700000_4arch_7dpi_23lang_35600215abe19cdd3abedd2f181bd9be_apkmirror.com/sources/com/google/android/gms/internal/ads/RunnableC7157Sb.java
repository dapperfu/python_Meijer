package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7157Sb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f70130a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7291Wb f70131b;

    RunnableC7157Sb(C7291Wb c7291Wb, View view) {
        this.f70130a = view;
        this.f70131b = c7291Wb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f70131b.b(this.f70130a);
    }
}
