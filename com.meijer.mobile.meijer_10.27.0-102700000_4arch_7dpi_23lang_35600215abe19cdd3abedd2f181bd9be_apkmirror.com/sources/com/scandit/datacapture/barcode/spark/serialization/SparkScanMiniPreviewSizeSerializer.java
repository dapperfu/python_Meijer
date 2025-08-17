package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanMiniPreviewSizeSerializer;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;", "miniPreviewSize", "", "toJson", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanMiniPreviewSizeSerializer {
    public static final SparkScanMiniPreviewSizeSerializer INSTANCE = new SparkScanMiniPreviewSizeSerializer();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SparkScanMiniPreviewSize.values().length];
            try {
                iArr[SparkScanMiniPreviewSize.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SparkScanMiniPreviewSize.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String toJson(SparkScanMiniPreviewSize miniPreviewSize) {
        Intrinsics.j(miniPreviewSize, "miniPreviewSize");
        int i10 = WhenMappings.$EnumSwitchMapping$0[miniPreviewSize.ordinal()];
        if (i10 == 1) {
            return "regular";
        }
        if (i10 == 2) {
            return "expanded";
        }
        throw new NoWhenBranchMatchedException();
    }

    private SparkScanMiniPreviewSizeSerializer() {
    }
}
