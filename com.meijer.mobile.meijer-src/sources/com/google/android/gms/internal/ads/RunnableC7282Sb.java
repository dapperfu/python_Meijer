package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7282Sb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f70970a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7416Wb f70971b;

    RunnableC7282Sb(C7416Wb c7416Wb, View view) {
        this.f70970a = view;
        this.f70971b = c7416Wb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f70971b.b(this.f70970a);
    }
}
