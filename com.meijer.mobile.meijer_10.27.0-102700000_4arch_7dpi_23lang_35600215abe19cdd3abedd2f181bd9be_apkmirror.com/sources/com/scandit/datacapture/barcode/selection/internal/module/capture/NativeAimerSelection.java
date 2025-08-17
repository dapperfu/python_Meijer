package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerBehavior;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeAimerSelection {

    @DjinniGenerated
    public static final class CppProxy extends NativeAimerSelection {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123835a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeSelectionType native_asSelectionType(long j10);

        private native BarcodeSelectionAimerBehavior native_getAimerBehavior(long j10);

        private native NativeSelectionStrategy native_getSelectionStrategy(long j10);

        private native void native_setAimerBehavior(long j10, BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior);

        private native void native_setSelectionStrategy(long j10, NativeSelectionStrategy nativeSelectionStrategy);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection
        public NativeSelectionType asSelectionType() {
            return native_asSelectionType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection
        public BarcodeSelectionAimerBehavior getAimerBehavior() {
            return native_getAimerBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection
        public NativeSelectionStrategy getSelectionStrategy() {
            return native_getSelectionStrategy(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection
        public void setAimerBehavior(BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior) {
            native_setAimerBehavior(this.nativeRef, barcodeSelectionAimerBehavior);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection
        public void setSelectionStrategy(NativeSelectionStrategy nativeSelectionStrategy) {
            native_setSelectionStrategy(this.nativeRef, nativeSelectionStrategy);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection
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

    public static native NativeAimerSelection create();

    public abstract NativeSelectionType asSelectionType();

    public abstract BarcodeSelectionAimerBehavior getAimerBehavior();

    public abstract NativeSelectionStrategy getSelectionStrategy();

    public abstract void setAimerBehavior(BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior);

    public abstract void setSelectionStrategy(NativeSelectionStrategy nativeSelectionStrategy);

    public abstract String toJson();
}
