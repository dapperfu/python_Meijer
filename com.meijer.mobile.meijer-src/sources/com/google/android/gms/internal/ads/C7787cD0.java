package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.cD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7787cD0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f73981a;

    /* renamed from: b, reason: collision with root package name */
    private final C8852mC0 f73982b;

    /* renamed from: c, reason: collision with root package name */
    private AudioRouting.OnRoutingChangedListener f73983c = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.bD0
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C7787cD0.a(this.f73606a, audioRouting);
        }
    };

    public static /* synthetic */ void a(C7787cD0 c7787cD0, AudioRouting audioRouting) {
        if (c7787cD0.f73983c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        c7787cD0.f73982b.h(audioRouting.getRoutedDevice());
    }

    public final void b() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.f73983c;
        onRoutingChangedListener.getClass();
        this.f73981a.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.f73983c = null;
    }

    public C7787cD0(AudioTrack audioTrack, C8852mC0 c8852mC0) {
        this.f73981a = audioTrack;
        this.f73982b = c8852mC0;
        audioTrack.addOnRoutingChangedListener(this.f73983c, new Handler(Looper.myLooper()));
    }
}
