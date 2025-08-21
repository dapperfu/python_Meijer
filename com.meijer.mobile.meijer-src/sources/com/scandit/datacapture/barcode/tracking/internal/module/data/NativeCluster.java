package com.scandit.datacapture.barcode.tracking.internal.module.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeCluster {

    @DjinniGenerated
    public static final class CppProxy extends NativeCluster {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124950a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native ArrayList<NativeBarcode> native_getBarcodes(long j10);

        private native int native_getIdentifier(long j10);

        private native Quadrilateral native_getLocationIgnoringLicense(long j10);

        private native String native_getUtf8String(long j10);

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster
        public ArrayList<NativeBarcode> getBarcodes() {
            return native_getBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster
        public int getIdentifier() {
            return native_getIdentifier(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster
        public Quadrilateral getLocationIgnoringLicense() {
            return native_getLocationIgnoringLicense(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster
        public String getUtf8String() {
            return native_getUtf8String(this.nativeRef);
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

    public abstract ArrayList<NativeBarcode> getBarcodes();

    public abstract int getIdentifier();

    public abstract Quadrilateral getLocationIgnoringLicense();

    public abstract String getUtf8String();
}
