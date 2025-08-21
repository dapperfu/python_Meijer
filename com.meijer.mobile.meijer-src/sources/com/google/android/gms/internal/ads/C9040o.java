package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9040o {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            C10042xL.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
