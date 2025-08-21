package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.internal.ads.Cb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6740Cb0 {

    /* renamed from: a, reason: collision with root package name */
    private static int f66651a = 2;

    public static void a(Context context) {
        context.registerReceiver(new C6706Bb0(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (C10167yb0.a() != EnumC7077Ma0.CTV) {
            return 2;
        }
        return f66651a;
    }
}
