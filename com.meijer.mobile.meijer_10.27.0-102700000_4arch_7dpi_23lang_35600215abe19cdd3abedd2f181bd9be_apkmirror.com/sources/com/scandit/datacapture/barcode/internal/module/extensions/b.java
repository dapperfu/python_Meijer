package com.scandit.datacapture.barcode.internal.module.extensions;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class b {
    public static final boolean a(Context context) {
        Intrinsics.j(context, "<this>");
        return context.getResources().getConfiguration().orientation == 2;
    }
}
