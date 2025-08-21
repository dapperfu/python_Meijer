package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArPopoverAnnotationAnchorSerializer;", "", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "anchor", "", "toJson", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArPopoverAnnotationAnchorSerializer {
    public static final BarcodeArPopoverAnnotationAnchorSerializer INSTANCE = new BarcodeArPopoverAnnotationAnchorSerializer();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeArPopoverAnnotationAnchor.values().length];
            try {
                iArr[BarcodeArPopoverAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeArPopoverAnnotationAnchor.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodeArPopoverAnnotationAnchor.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarcodeArPopoverAnnotationAnchor.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String toJson(BarcodeArPopoverAnnotationAnchor anchor) {
        Intrinsics.j(anchor, "anchor");
        int i10 = WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()];
        if (i10 == 1) {
            return "top";
        }
        if (i10 == 2) {
            return "bottom";
        }
        if (i10 == 3) {
            return "left";
        }
        if (i10 == 4) {
            return "right";
        }
        throw new NoWhenBranchMatchedException();
    }

    private BarcodeArPopoverAnnotationAnchorSerializer() {
    }
}
