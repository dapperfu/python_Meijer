package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanLicenseInfo {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanLicenseInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124853a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<Symbology> native_getLicensedSymbologies(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanLicenseInfo
        public HashSet<Symbology> getLicensedSymbologies() {
            return native_getLicensedSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanLicenseInfo
        public String toJson() {
            return native_toJson(this.nativeRef);
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

    public abstract HashSet<Symbology> getLicensedSymbologies();

    public abstract String toJson();
}
