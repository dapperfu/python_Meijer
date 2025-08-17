package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class UD0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f70564a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private LoudnessCodecController f70565b;

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f70565b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C8086gC.f(this.f70564a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f70564a.clear();
        LoudnessCodecController loudnessCodecController = this.f70565b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f70564a.remove(mediaCodec) || (loudnessCodecController = this.f70565b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f70565b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f70565b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, C7923ek0.c(), new RD0(this));
        this.f70565b = loudnessCodecControllerCreate;
        Iterator it = this.f70564a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public UD0(TD0 td0) {
    }
}
