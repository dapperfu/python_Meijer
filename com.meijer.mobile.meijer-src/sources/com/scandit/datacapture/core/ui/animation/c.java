package com.scandit.datacapture.core.ui.animation;

import android.os.SystemClock;
import android.view.Choreographer;

/* loaded from: classes12.dex */
public final class c extends AnimationHandler$AnimationFrameCallbackProvider {

    /* renamed from: b, reason: collision with root package name */
    public final Choreographer f126958b;

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer.FrameCallback f126959c;

    public final void a(long j10) {
        a aVar = this.f126927a;
        aVar.f126957a.f126965e = SystemClock.uptimeMillis();
        d dVar = aVar.f126957a;
        long j11 = dVar.f126965e;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < dVar.f126962b.size(); i10++) {
            b bVar = (b) dVar.f126962b.get(i10);
            if (bVar != null) {
                Long l10 = (Long) dVar.f126961a.get(bVar);
                if (l10 == null) {
                    bVar.doAnimationFrame(j11);
                } else if (l10.longValue() < jUptimeMillis) {
                    dVar.f126961a.remove(bVar);
                    bVar.doAnimationFrame(j11);
                }
            }
        }
        if (dVar.f126966f) {
            for (int size = dVar.f126962b.size() - 1; size >= 0; size--) {
                if (dVar.f126962b.get(size) == null) {
                    dVar.f126962b.remove(size);
                }
            }
            dVar.f126966f = false;
        }
        if (aVar.f126957a.f126962b.size() > 0) {
            d dVar2 = aVar.f126957a;
            if (dVar2.f126964d == null) {
                dVar2.f126964d = new c(dVar2.f126963c);
            }
            c cVar = dVar2.f126964d;
            cVar.f126958b.postFrameCallback(cVar.f126959c);
        }
    }

    public c(a aVar) {
        super(aVar);
        this.f126958b = Choreographer.getInstance();
        this.f126959c = new Choreographer.FrameCallback() { // from class: com.scandit.datacapture.core.ui.animation.v
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f126971a.a(j10);
            }
        };
    }

    public final void a() {
        this.f126958b.postFrameCallback(this.f126959c);
    }
}
