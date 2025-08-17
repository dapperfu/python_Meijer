package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7165Sf {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f70135a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f70136b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f70137c;

    public final com.google.common.util.concurrent.q a() {
        return (Cj0) Mj0.o(Cj0.D(Mj0.h(null)), ((Long) C8661lg.f76616c.e()).longValue(), TimeUnit.MILLISECONDS, this.f70137c);
    }

    public C7165Sf(Context context, ScheduledExecutorService scheduledExecutorService, C7233Uf c7233Uf, W80 w80) {
        this.f70137c = scheduledExecutorService;
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f70135a.getEventTime()) {
            this.f70135a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f70136b.getEventTime()) {
            this.f70136b = MotionEvent.obtain(motionEvent);
        }
    }
}
