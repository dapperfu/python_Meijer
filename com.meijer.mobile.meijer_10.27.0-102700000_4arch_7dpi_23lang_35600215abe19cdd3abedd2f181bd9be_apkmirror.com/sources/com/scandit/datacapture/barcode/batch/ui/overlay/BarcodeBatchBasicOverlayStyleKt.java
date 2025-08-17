package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "toNative", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeBatchBasicOverlayStyleKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BarcodeBatchBasicOverlayStyle.values().length];
            try {
                iArr[BarcodeBatchBasicOverlayStyle.FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeBatchBasicOverlayStyle.DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeBarcodeTrackingBasicOverlayStyle.values().length];
            try {
                iArr2[NativeBarcodeTrackingBasicOverlayStyle.FRAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeBarcodeTrackingBasicOverlayStyle.DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BarcodeBatchBasicOverlayStyle fromNative(NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyle) {
        Intrinsics.j(nativeBarcodeTrackingBasicOverlayStyle, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[nativeBarcodeTrackingBasicOverlayStyle.ordinal()];
        if (i10 == 1) {
            return BarcodeBatchBasicOverlayStyle.FRAME;
        }
        if (i10 == 2) {
            return BarcodeBatchBasicOverlayStyle.DOT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final NativeBarcodeTrackingBasicOverlayStyle toNative(BarcodeBatchBasicOverlayStyle barcodeBatchBasicOverlayStyle) {
        Intrinsics.j(barcodeBatchBasicOverlayStyle, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[barcodeBatchBasicOverlayStyle.ordinal()];
        if (i10 == 1) {
            return NativeBarcodeTrackingBasicOverlayStyle.FRAME;
        }
        if (i10 == 2) {
            return NativeBarcodeTrackingBasicOverlayStyle.DOT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
