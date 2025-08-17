package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.cD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7662cD0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f73141a;

    /* renamed from: b, reason: collision with root package name */
    private final C8727mC0 f73142b;

    /* renamed from: c, reason: collision with root package name */
    private AudioRouting.OnRoutingChangedListener f73143c = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.bD0
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C7662cD0.a(this.f72766a, audioRouting);
        }
    };

    public static /* synthetic */ void a(C7662cD0 c7662cD0, AudioRouting audioRouting) {
        if (c7662cD0.f73143c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        c7662cD0.f73142b.h(audioRouting.getRoutedDevice());
    }

    public final void b() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.f73143c;
        onRoutingChangedListener.getClass();
        this.f73141a.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.f73143c = null;
    }

    public C7662cD0(AudioTrack audioTrack, C8727mC0 c8727mC0) {
        this.f73141a = audioTrack;
        this.f73142b = c8727mC0;
        audioTrack.addOnRoutingChangedListener(this.f73143c, new Handler(Looper.myLooper()));
    }
}
