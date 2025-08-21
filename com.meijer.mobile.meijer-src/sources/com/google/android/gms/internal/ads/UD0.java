package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class UD0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f71404a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private LoudnessCodecController f71405b;

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f71405b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C8211gC.f(this.f71404a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f71404a.clear();
        LoudnessCodecController loudnessCodecController = this.f71405b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f71404a.remove(mediaCodec) || (loudnessCodecController = this.f71405b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i10) {
        LoudnessCodecController loudnessCodecController = this.f71405b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f71405b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, C8048ek0.c(), new RD0(this));
        this.f71405b = loudnessCodecControllerCreate;
        Iterator it = this.f71404a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public UD0(TD0 td0) {
    }
}
