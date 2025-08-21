package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeClusterEditor {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeClusterEditor {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121658a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_dissolveCluster(long j10, NativeCluster nativeCluster);

        private native void native_endEditing(long j10);

        private native void native_formCluster(long j10, ArrayList<NativeBarcode> arrayList);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor
        public void dissolveCluster(NativeCluster nativeCluster) {
            native_dissolveCluster(this.nativeRef, nativeCluster);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor
        public void endEditing() {
            native_endEditing(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor
        public void formCluster(ArrayList<NativeBarcode> arrayList) {
            native_formCluster(this.nativeRef, arrayList);
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

    public abstract void dissolveCluster(NativeCluster nativeCluster);

    public abstract void endEditing();

    public abstract void formCluster(ArrayList<NativeBarcode> arrayList);
}
