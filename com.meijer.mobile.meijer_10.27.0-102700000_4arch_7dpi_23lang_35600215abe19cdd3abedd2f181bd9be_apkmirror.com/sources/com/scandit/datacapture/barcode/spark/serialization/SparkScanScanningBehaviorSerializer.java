package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningBehaviorSerializer;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "scanningBehavior", "", "toJson", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanScanningBehaviorSerializer {
    public static final SparkScanScanningBehaviorSerializer INSTANCE = new SparkScanScanningBehaviorSerializer();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SparkScanScanningBehavior.values().length];
            try {
                iArr[SparkScanScanningBehavior.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SparkScanScanningBehavior.CONTINUOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String toJson(SparkScanScanningBehavior scanningBehavior) {
        Intrinsics.j(scanningBehavior, "scanningBehavior");
        int i10 = WhenMappings.$EnumSwitchMapping$0[scanningBehavior.ordinal()];
        if (i10 == 1) {
            return "single";
        }
        if (i10 == 2) {
            return "continuous";
        }
        throw new NoWhenBranchMatchedException();
    }

    private SparkScanScanningBehaviorSerializer() {
    }
}
