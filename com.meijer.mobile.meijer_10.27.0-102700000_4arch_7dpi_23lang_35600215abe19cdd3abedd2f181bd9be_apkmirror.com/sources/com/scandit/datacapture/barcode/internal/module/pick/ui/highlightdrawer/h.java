package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class h {
    public static final float a(BarcodePickState barcodePickState) {
        Intrinsics.j(barcodePickState, "<this>");
        return g.f122652a[barcodePickState.ordinal()] == 1 ? 6.0f : 5.0f;
    }
}
