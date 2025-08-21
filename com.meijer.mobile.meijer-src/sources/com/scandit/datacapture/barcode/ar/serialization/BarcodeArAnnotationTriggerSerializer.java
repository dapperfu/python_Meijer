package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArAnnotationTriggerSerializer;", "", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "annotationTrigger", "", "toJson", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArAnnotationTriggerSerializer {
    public static final BarcodeArAnnotationTriggerSerializer INSTANCE = new BarcodeArAnnotationTriggerSerializer();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeArAnnotationTrigger.values().length];
            try {
                iArr[BarcodeArAnnotationTrigger.HIGHLIGHT_TAP_AND_BARCODE_SCAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeArAnnotationTrigger.HIGHLIGHT_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String toJson(BarcodeArAnnotationTrigger annotationTrigger) {
        Intrinsics.j(annotationTrigger, "annotationTrigger");
        int i10 = WhenMappings.$EnumSwitchMapping$0[annotationTrigger.ordinal()];
        if (i10 == 1) {
            return "highlightTapAndBarcodeScan";
        }
        if (i10 == 2) {
            return "highlightTap";
        }
        throw new NoWhenBranchMatchedException();
    }

    private BarcodeArAnnotationTriggerSerializer() {
    }
}
