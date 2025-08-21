package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanScanningModeTarget {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanScanningModeTarget {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124856a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeSparkScanScanningMode native_asScanningMode(long j10);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningModeTarget
        public NativeSparkScanScanningMode asScanningMode() {
            return native_asScanningMode(this.nativeRef);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public static native NativeSparkScanScanningModeTarget create(SparkScanScanningBehavior sparkScanScanningBehavior, SparkScanPreviewBehavior sparkScanPreviewBehavior);

    public abstract NativeSparkScanScanningMode asScanningMode();
}
