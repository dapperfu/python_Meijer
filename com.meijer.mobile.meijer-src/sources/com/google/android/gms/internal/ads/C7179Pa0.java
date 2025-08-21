package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.internal.ads.Pa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7179Pa0 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Timer f70203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7281Sa0 f70204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6934Ht f70205c;

    C7179Pa0(C7281Sa0 c7281Sa0, C6934Ht c6934Ht, Timer timer) {
        this.f70205c = c6934Ht;
        this.f70203a = timer;
        this.f70204b = c7281Sa0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f70204b.h();
        this.f70205c.a(true);
        this.f70203a.cancel();
    }
}
