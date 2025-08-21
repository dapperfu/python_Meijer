package com.scandit.datacapture.barcode.ui.overlay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;", "toNative", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodeCaptureOverlayStyleKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeCaptureOverlayStyle.values().length];
            try {
                iArr[BarcodeCaptureOverlayStyle.FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeBarcodeCaptureOverlayStyle.values().length];
            try {
                iArr2[NativeBarcodeCaptureOverlayStyle.FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BarcodeCaptureOverlayStyle fromNative(NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle) {
        Intrinsics.j(nativeBarcodeCaptureOverlayStyle, "<this>");
        if (WhenMappings.$EnumSwitchMapping$1[nativeBarcodeCaptureOverlayStyle.ordinal()] == 1) {
            return BarcodeCaptureOverlayStyle.FRAME;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final NativeBarcodeCaptureOverlayStyle toNative(BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        Intrinsics.j(barcodeCaptureOverlayStyle, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[barcodeCaptureOverlayStyle.ordinal()] == 1) {
            return NativeBarcodeCaptureOverlayStyle.FRAME;
        }
        throw new NoWhenBranchMatchedException();
    }
}
