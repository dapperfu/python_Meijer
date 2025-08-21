package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanViewStateHelper {
    public static native boolean isCaptureEnabledState(SparkScanViewState sparkScanViewState);

    public static native boolean isExpandedState(SparkScanViewState sparkScanViewState);

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanViewStateHelper {
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private CppProxy(long j10) {
            new AtomicBoolean(false);
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }
}
