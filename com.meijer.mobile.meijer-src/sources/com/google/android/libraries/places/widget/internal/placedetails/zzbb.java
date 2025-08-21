package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzbb {
    public static final zzbc zza(boolean z10, List fieldsToLoad, Context context) {
        Intrinsics.j(fieldsToLoad, "fieldsToLoad");
        Intrinsics.j(context, "context");
        float f10 = context.getResources().getDisplayMetrics().density;
        int i10 = (int) (context.getResources().getConfiguration().screenWidthDp * f10);
        int i11 = (int) (context.getResources().getConfiguration().screenHeightDp * f10);
        return new zzbc(z10, fieldsToLoad, Math.min(i10, i11), Math.max(i10, i11));
    }
}
