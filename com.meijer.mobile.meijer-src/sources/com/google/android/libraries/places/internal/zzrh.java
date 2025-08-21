package com.google.android.libraries.places.internal;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Random;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@SuppressLint({"TikTok.UnpropagatedTraceOnStartActivity"})
/* loaded from: classes6.dex */
public final class zzrh {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    @JvmStatic
    public static final Runnable zza(Runnable runnable) {
        Intrinsics.j(runnable, "runnable");
        return new zzrg(new Ref.ObjectRef(), zzqj.zzb(false), runnable);
    }
}
