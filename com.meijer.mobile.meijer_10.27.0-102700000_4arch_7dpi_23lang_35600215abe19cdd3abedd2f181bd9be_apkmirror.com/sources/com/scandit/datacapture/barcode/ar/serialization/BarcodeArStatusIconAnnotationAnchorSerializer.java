package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArStatusIconAnnotationAnchorSerializer;", "", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "anchor", "", "toJson", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArStatusIconAnnotationAnchorSerializer {
    public static final BarcodeArStatusIconAnnotationAnchorSerializer INSTANCE = new BarcodeArStatusIconAnnotationAnchorSerializer();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeArStatusIconAnnotationAnchor.values().length];
            try {
                iArr[BarcodeArStatusIconAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeArStatusIconAnnotationAnchor.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodeArStatusIconAnnotationAnchor.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarcodeArStatusIconAnnotationAnchor.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String toJson(BarcodeArStatusIconAnnotationAnchor anchor) {
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

    private BarcodeArStatusIconAnnotationAnchorSerializer() {
    }
}
