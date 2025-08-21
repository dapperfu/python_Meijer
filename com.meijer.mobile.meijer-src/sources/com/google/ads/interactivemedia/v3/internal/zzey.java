package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzey implements zzex {
    @Override // com.google.ads.interactivemedia.v3.internal.zzex
    public final boolean zza(zzew zzewVar, Context context, boolean z10, boolean z11) {
        String packageName = context.getApplicationContext().getPackageName();
        List list = zzewVar.zzd;
        if ((list == null || !list.contains(packageName)) && !z10 && z11) {
            return true;
        }
        return false;
    }
}
