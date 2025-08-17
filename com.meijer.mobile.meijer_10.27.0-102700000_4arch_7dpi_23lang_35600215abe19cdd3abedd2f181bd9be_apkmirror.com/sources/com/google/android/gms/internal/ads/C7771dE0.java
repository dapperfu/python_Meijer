package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* renamed from: com.google.android.gms.internal.ads.dE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7771dE0 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f73380a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (OV.f69091a < 29) {
            return 0;
        }
        Boolean bool = f73380a;
        if (bool == null || !bool.booleanValue()) {
            return C7664cE0.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
