package com.google.ads.interactivemedia.pal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.pal.HandlerC10743j6;
import com.google.android.gms.internal.pal.InterfaceC10641d2;

/* loaded from: classes4.dex */
final class zzaj implements InterfaceC10641d2 {
    zzaj() {
    }

    public static final Handler zza() {
        return new HandlerC10743j6(Looper.getMainLooper());
    }
}
