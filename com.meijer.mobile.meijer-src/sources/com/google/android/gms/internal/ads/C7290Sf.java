package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7290Sf {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f70975a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f70976b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f70977c;

    public final com.google.common.util.concurrent.q a() {
        return (Cj0) Mj0.o(Cj0.D(Mj0.h(null)), ((Long) C8786lg.f77456c.e()).longValue(), TimeUnit.MILLISECONDS, this.f70977c);
    }

    public C7290Sf(Context context, ScheduledExecutorService scheduledExecutorService, C7358Uf c7358Uf, W80 w80) {
        this.f70977c = scheduledExecutorService;
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f70975a.getEventTime()) {
            this.f70975a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f70976b.getEventTime()) {
            this.f70976b = MotionEvent.obtain(motionEvent);
        }
    }
}
