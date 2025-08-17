package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7043Oq {

    /* renamed from: a, reason: collision with root package name */
    public final AudioAttributes f69186a;

    /* synthetic */ C7043Oq(HR hr2, C8516kE c8516kE) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = OV.f69091a;
        if (i10 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i10 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f69186a = usage.build();
    }
}
