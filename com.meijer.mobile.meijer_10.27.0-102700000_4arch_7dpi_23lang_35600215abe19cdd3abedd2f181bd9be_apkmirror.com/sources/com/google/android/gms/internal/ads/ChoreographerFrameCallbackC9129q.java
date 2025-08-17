package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ChoreographerFrameCallbackC9129q implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final ChoreographerFrameCallbackC9129q f77682f = new ChoreographerFrameCallbackC9129q();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f77683a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f77684b;

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f77685c;

    /* renamed from: d, reason: collision with root package name */
    private Choreographer f77686d;

    /* renamed from: e, reason: collision with root package name */
    private int f77687e;

    public static ChoreographerFrameCallbackC9129q a() {
        return f77682f;
    }

    public final void b() {
        this.f77684b.sendEmptyMessage(2);
    }

    public final void c() {
        this.f77684b.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f77683a = j10;
        Choreographer choreographer = this.f77686d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.f77686d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                C9917xL.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.f77686d;
            if (choreographer != null) {
                int i11 = this.f77687e + 1;
                this.f77687e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f77686d;
        if (choreographer2 != null) {
            int i12 = this.f77687e - 1;
            this.f77687e = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f77683a = -9223372036854775807L;
            }
        }
        return true;
    }

    private ChoreographerFrameCallbackC9129q() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f77685c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f77684b = handler;
        handler.sendEmptyMessage(1);
    }
}
