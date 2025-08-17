package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes6.dex */
final class Iy0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f67736a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Ky0 f67737b;

    public Iy0(Ky0 ky0, Handler handler) {
        this.f67737b = ky0;
        this.f67736a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f67736a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Hy0
            @Override // java.lang.Runnable
            public final void run() {
                Ky0.c(this.f67524a.f67737b, i10);
            }
        });
    }
}
