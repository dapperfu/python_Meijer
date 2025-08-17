package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.widget.ImageButton;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class p extends ImageButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setBackground(null);
        FS.Resources_setImageResource(this, R.drawable.sc_ic_single_scan);
        setContentDescription(BarcodeCountViewDefaults.INSTANCE.getSingleScanButtonContentDescription());
    }
}
