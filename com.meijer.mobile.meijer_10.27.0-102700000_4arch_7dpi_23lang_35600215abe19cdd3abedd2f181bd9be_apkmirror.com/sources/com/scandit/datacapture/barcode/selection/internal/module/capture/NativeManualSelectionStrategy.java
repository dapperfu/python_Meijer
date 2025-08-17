package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeManualSelectionStrategy {

    @DjinniGenerated
    public static final class CppProxy extends NativeManualSelectionStrategy {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123841a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeSelectionStrategy native_asSelectionStrategy(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy
        public NativeSelectionStrategy asSelectionStrategy() {
            return native_asSelectionStrategy(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy
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

    public static native NativeManualSelectionStrategy create();

    public abstract NativeSelectionStrategy asSelectionStrategy();

    public abstract String toJson();
}
