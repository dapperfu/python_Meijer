package com.scandit.datacapture.barcode.internal.module.extensions;

import android.graphics.Color;
import com.medallia.digital.mobilesdk.l3;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public abstract class a {
    public static final int a(int i10, int i11) {
        return (i10 & 16777215) | (RangesKt.o(i11, 0, l3.f92484c) << 24);
    }

    public static final String a(int i10) {
        String str = String.format("#%06X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i10 & 16777215), Integer.valueOf(Color.alpha(i10))}, 2));
        Intrinsics.i(str, "format(...)");
        return str;
    }
}
