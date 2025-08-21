package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class Q {
    public static final int a(Size size) {
        Intrinsics.j(size, "<this>");
        return size.getHeight() / 2;
    }

    public static final int b(Size size) {
        Intrinsics.j(size, "<this>");
        return size.getWidth() / 2;
    }
}
