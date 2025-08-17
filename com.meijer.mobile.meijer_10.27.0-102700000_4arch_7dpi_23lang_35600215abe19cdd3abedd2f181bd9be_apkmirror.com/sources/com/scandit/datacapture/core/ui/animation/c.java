package com.scandit.datacapture.core.ui.animation;

import android.os.SystemClock;
import android.view.Choreographer;

/* loaded from: classes11.dex */
public final class c extends AnimationHandler$AnimationFrameCallbackProvider {

    /* renamed from: b, reason: collision with root package name */
    public final Choreographer f126006b;

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer.FrameCallback f126007c;

    public final void a(long j10) {
        a aVar = this.f125975a;
        aVar.f126005a.f126013e = SystemClock.uptimeMillis();
        d dVar = aVar.f126005a;
        long j11 = dVar.f126013e;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < dVar.f126010b.size(); i10++) {
            b bVar = (b) dVar.f126010b.get(i10);
            if (bVar != null) {
                Long l10 = (Long) dVar.f126009a.get(bVar);
                if (l10 == null) {
                    bVar.doAnimationFrame(j11);
                } else if (l10.longValue() < jUptimeMillis) {
                    dVar.f126009a.remove(bVar);
                    bVar.doAnimationFrame(j11);
                }
            }
        }
        if (dVar.f126014f) {
            for (int size = dVar.f126010b.size() - 1; size >= 0; size--) {
                if (dVar.f126010b.get(size) == null) {
                    dVar.f126010b.remove(size);
                }
            }
            dVar.f126014f = false;
        }
        if (aVar.f126005a.f126010b.size() > 0) {
            d dVar2 = aVar.f126005a;
            if (dVar2.f126012d == null) {
                dVar2.f126012d = new c(dVar2.f126011c);
            }
            c cVar = dVar2.f126012d;
            cVar.f126006b.postFrameCallback(cVar.f126007c);
        }
    }

    public c(a aVar) {
        super(aVar);
        this.f126006b = Choreographer.getInstance();
        this.f126007c = new Choreographer.FrameCallback() { // from class: com.scandit.datacapture.core.ui.animation.v
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f126019a.a(j10);
            }
        };
    }

    public final void a() {
        this.f126006b.postFrameCallback(this.f126007c);
    }
}
