package com.scandit.datacapture.barcode.internal.module.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCaptureLicenseInfo {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCaptureLicenseInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122225a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<Symbology> native_getLicensedSymbologies(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureLicenseInfo
        public HashSet<Symbology> getLicensedSymbologies() {
            return native_getLicensedSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureLicenseInfo
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
