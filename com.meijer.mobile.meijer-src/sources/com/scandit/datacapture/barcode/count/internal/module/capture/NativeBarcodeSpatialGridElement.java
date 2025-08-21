package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeSpatialGridElement {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSpatialGridElement {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121674a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeBarcode native_mainBarcode(long j10);

        private native NativeBarcode native_subBarcode(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement
        public NativeBarcode mainBarcode() {
            return native_mainBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement
        public NativeBarcode subBarcode() {
            return native_subBarcode(this.nativeRef);
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

    public abstract NativeBarcode mainBarcode();

    public abstract NativeBarcode subBarcode();
}
