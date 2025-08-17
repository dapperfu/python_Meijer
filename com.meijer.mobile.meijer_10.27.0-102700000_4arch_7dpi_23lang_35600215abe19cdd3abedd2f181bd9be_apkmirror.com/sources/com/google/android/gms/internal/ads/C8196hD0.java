package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.hD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8196hD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f74638a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f74639b = new C8089gD0(this);

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8408jD0 f74640c;

    public C8196hD0(C8408jD0 c8408jD0) {
        this.f74640c = c8408jD0;
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f74638a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.fD0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f74639b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f74639b);
        this.f74638a.removeCallbacksAndMessages(null);
    }
}
