package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickActionCallback {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickActionCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122420a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_onResponse(long j10, String str, boolean z10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionCallback
        public void onResponse(String str, boolean z10) {
            native_onResponse(this.nativeRef, str, z10);
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

    public abstract void onResponse(String str, boolean z10);
}
