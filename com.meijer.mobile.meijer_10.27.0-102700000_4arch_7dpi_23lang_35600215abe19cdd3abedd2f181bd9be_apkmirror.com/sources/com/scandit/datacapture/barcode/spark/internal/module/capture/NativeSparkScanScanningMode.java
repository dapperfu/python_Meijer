package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanPreviewBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSparkScanScanningMode {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanScanningMode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123902a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native SparkScanPreviewBehavior native_getPreviewBehavior(long j10);

        private native SparkScanScanningBehavior native_getScanningBehavior(long j10);

        private native NativeSparkScanScanningModeType native_getType(long j10);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode
        public SparkScanPreviewBehavior getPreviewBehavior() {
            return native_getPreviewBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode
        public SparkScanScanningBehavior getScanningBehavior() {
            return native_getScanningBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanScanningMode
        public NativeSparkScanScanningModeType getType() {
            return native_getType(this.nativeRef);
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

    public abstract SparkScanPreviewBehavior getPreviewBehavior();

    public abstract SparkScanScanningBehavior getScanningBehavior();

    public abstract NativeSparkScanScanningModeType getType();
}
