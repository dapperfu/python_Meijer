package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.internal.ads.Pa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7054Pa0 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Timer f69363a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7156Sa0 f69364b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6809Ht f69365c;

    C7054Pa0(C7156Sa0 c7156Sa0, C6809Ht c6809Ht, Timer timer) {
        this.f69365c = c6809Ht;
        this.f69363a = timer;
        this.f69364b = c7156Sa0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f69364b.h();
        this.f69365c.a(true);
        this.f69363a.cancel();
    }
}
