package com.scandit.datacapture.core.ui.orientation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceOrientationUtilsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceOrientation.values().length];
            try {
                iArr[DeviceOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceOrientation.PORTRAIT_UPSIDE_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ String toJson(DeviceOrientation deviceOrientation) {
        Intrinsics.j(deviceOrientation, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[deviceOrientation.ordinal()];
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 == 2) {
            return "landscapeRight";
        }
        if (i10 == 3) {
            return "portraitUpsideDown";
        }
        if (i10 == 4) {
            return "landscapeLeft";
        }
        throw new NoWhenBranchMatchedException();
    }
}
