package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8321hD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f75478a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f75479b = new C8214gD0(this);

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8533jD0 f75480c;

    public C8321hD0(C8533jD0 c8533jD0) {
        this.f75480c = c8533jD0;
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f75478a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.fD0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f75479b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f75479b);
        this.f75478a.removeCallbacksAndMessages(null);
    }
}
