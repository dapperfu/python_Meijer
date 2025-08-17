package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: com.google.android.gms.internal.ads.gD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8089gD0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8196hD0 f74283a;

    C8089gD0(C8196hD0 c8196hD0) {
        this.f74283a = c8196hD0;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        audioTrack.equals(this.f74283a.f74640c.f75414q);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f74283a.f74640c.f75414q)) {
            this.f74283a.f74640c.f75384N = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.f74283a.f74640c.f75414q);
    }
}
