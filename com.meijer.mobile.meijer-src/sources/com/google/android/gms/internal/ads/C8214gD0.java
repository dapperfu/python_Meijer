package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: com.google.android.gms.internal.ads.gD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8214gD0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8321hD0 f75123a;

    C8214gD0(C8321hD0 c8321hD0) {
        this.f75123a = c8321hD0;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        audioTrack.equals(this.f75123a.f75480c.f76254q);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f75123a.f75480c.f76254q)) {
            this.f75123a.f75480c.f76224N = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.f75123a.f75480c.f76254q);
    }
}
