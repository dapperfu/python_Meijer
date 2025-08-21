package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ChoreographerFrameCallbackC9254q implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final ChoreographerFrameCallbackC9254q f78522f = new ChoreographerFrameCallbackC9254q();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f78523a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f78524b;

    /* renamed from: c, reason: collision with root package name */
    private final HandlerThread f78525c;

    /* renamed from: d, reason: collision with root package name */
    private Choreographer f78526d;

    /* renamed from: e, reason: collision with root package name */
    private int f78527e;

    public static ChoreographerFrameCallbackC9254q a() {
        return f78522f;
    }

    public final void b() {
        this.f78524b.sendEmptyMessage(2);
    }

    public final void c() {
        this.f78524b.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f78523a = j10;
        Choreographer choreographer = this.f78526d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.f78526d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                C10042xL.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.f78526d;
            if (choreographer != null) {
                int i11 = this.f78527e + 1;
                this.f78527e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f78526d;
        if (choreographer2 != null) {
            int i12 = this.f78527e - 1;
            this.f78527e = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f78523a = -9223372036854775807L;
            }
        }
        return true;
    }

    private ChoreographerFrameCallbackC9254q() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f78525c = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f78524b = handler;
        handler.sendEmptyMessage(1);
    }
}
