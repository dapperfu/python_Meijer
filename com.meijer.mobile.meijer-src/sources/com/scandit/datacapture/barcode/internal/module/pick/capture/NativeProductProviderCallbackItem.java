package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeProductProviderCallbackItem {

    @DjinniGenerated
    public static final class CppProxy extends NativeProductProviderCallbackItem {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123379a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_getToBeTransformedData(long j10);

        private native String native_getTransformationResult(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem
        public String getToBeTransformedData() {
            return native_getToBeTransformedData(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem
        public String getTransformationResult() {
            return native_getTransformationResult(this.nativeRef);
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

    public static native NativeProductProviderCallbackItem create(String str, String str2);

    public abstract String getToBeTransformedData();

    public abstract String getTransformationResult();
}
