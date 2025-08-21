package com.scandit.datacapture.barcode.hardwarebutton;

import android.os.Build;
import android.view.View;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.internal.sdk.utils.DeviceUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a1\u0010\n\u001a\u00020\b*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "isHardwareTriggerSupported", "()Z", "Landroid/view/View;", "", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "Lkotlin/Function1;", "Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareKeyEvent;", "", "onEvent", "setupHardwareTrigger", "(Landroid/view/View;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class HardwareButtonHelperKt {
    public static final boolean isHardwareTriggerSupported() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final void setupHardwareTrigger(View view, Integer num, Function1<? super HardwareKeyEvent, Unit> onEvent) {
        Intrinsics.j(view, "<this>");
        Intrinsics.j(onEvent, "onEvent");
        if (isHardwareTriggerSupported()) {
            view.addOnUnhandledKeyEventListener(new HardwareButtonKeyListener(num != null ? num.intValue() : DeviceUtils.INSTANCE.isXCoverDevice$scandit_barcode_capture() ? 1015 : 25, onEvent));
        }
    }
}
