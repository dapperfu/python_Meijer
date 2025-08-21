package com.google.android.libraries.places.internal;

import Ee.L;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes6.dex */
public abstract class zzre {
    zzre() {
    }

    public abstract L zza();

    public abstract L zzb();

    public abstract UUID zzc();

    public abstract long zzd();

    public final String toString() {
        return TextUtils.join(" -> ", zza());
    }
}
