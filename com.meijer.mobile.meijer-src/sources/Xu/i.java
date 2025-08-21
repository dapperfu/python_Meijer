package Xu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class i extends a implements Runnable {
    public i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42672b = Thread.currentThread();
        try {
            this.f42671a.run();
            this.f42672b = null;
        } catch (Throwable th2) {
            this.f42672b = null;
            lazySet(a.f42669c);
            C13558a.s(th2);
        }
    }
}
