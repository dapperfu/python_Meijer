package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.internal.ads.cJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class GestureDetectorOnGestureListenerC7672cJ implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final C9379sI f73151a;

    /* renamed from: b, reason: collision with root package name */
    private final UI f73152b;

    GestureDetectorOnGestureListenerC7672cJ(C9379sI c9379sI, UI ui2) {
        this.f73151a = c9379sI;
        this.f73152b = ui2;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:23:0x0064, B:25:0x006c, B:15:0x0030, B:19:0x0044, B:22:0x0057), top: B:32:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.sI r0 = r5.f73151a     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 != 0) goto L8
            goto L79
        L8:
            float r0 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L2a
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = -1
            r3 = 1148846080(0x447a0000, float:1000.0)
            r4 = 0
            if (r0 <= 0) goto L40
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L2c
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            goto L64
        L2a:
            r6 = move-exception
            goto L7b
        L2c:
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 >= 0) goto L3e
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 2
            goto L64
        L3e:
            r6 = r1
            goto L64
        L40:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 <= 0) goto L53
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 8
            goto L64
        L53:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L3e
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 4
        L64:
            com.google.android.gms.internal.ads.sI r7 = r5.f73151a     // Catch: java.lang.Throwable -> L2a
            int r7 = r7.I()     // Catch: java.lang.Throwable -> L2a
            if (r2 != r7) goto L79
            com.google.android.gms.internal.ads.sI r7 = r5.f73151a     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.UI r8 = r5.f73152b     // Catch: java.lang.Throwable -> L2a
            android.widget.FrameLayout r8 = r8.C9()     // Catch: java.lang.Throwable -> L2a
            r7.m(r8, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return r1
        L79:
            monitor-exit(r5)
            return r1
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GestureDetectorOnGestureListenerC7672cJ.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
