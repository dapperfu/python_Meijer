package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.R;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13365l {
    public static StateListDrawable a(Context context, boolean z10) {
        Intrinsics.j(context, "context");
        if (z10) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_in_pressed));
            stateListDrawable.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_in));
            return stateListDrawable;
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_out_pressed));
        stateListDrawable2.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_out));
        return stateListDrawable2;
    }

    public static StateListDrawable a(Context context, SparkScanMiniPreviewSize miniPreviewSize) {
        Intrinsics.j(context, "context");
        Intrinsics.j(miniPreviewSize, "miniPreviewSize");
        int i10 = AbstractC13364k.f124155a[miniPreviewSize.ordinal()];
        if (i10 == 1) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_spark_scan_collapsed_pressed));
            stateListDrawable.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_spark_scan_collapsed));
            return stateListDrawable;
        }
        if (i10 == 2) {
            StateListDrawable stateListDrawable2 = new StateListDrawable();
            stateListDrawable2.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_spark_scan_expanded_pressed));
            stateListDrawable2.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_spark_scan_expanded));
            return stateListDrawable2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static StateListDrawable a(Context context) {
        Intrinsics.j(context, "context");
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_close_pressed));
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_close));
        stateListDrawable.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_close_disabled));
        return stateListDrawable;
    }

    public static StateListDrawable a(Context context, TorchState torchState) {
        Intrinsics.j(context, "context");
        Intrinsics.j(torchState, "torchState");
        if (AbstractC13364k.f124156b[torchState.ordinal()] == 1) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_torch_on_pressed));
            stateListDrawable.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_torch_on));
            return stateListDrawable;
        }
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{R.attr.state_pressed}, FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_torch_off_pressed));
        stateListDrawable2.addState(new int[0], FS.Resources_getDrawable(context, com.scandit.datacapture.barcode.R.drawable.sc_ic_spark_scan_torch_off));
        return stateListDrawable2;
    }
}
