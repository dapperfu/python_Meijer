package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7168Oq {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f70026a;

    /* synthetic */ C7168Oq(HR hr2, C8641kE c8641kE) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = OV.f69931a;
        if (i10 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i10 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f70026a = usage.build();
    }
}
