package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeGuidanceHint {

    @DjinniGenerated
    public static final class CppProxy extends NativeGuidanceHint {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125145a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeHintStyle native_getHintStyle(long j10);

        private native String native_getText(long j10);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint
        public NativeHintStyle getHintStyle() {
            return native_getHintStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint
        public String getText() {
            return native_getText(this.nativeRef);
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

    public static native NativeGuidanceHint create(NativeGuidanceHintStyle nativeGuidanceHintStyle, String str, NativeGuidanceHintAnchor nativeGuidanceHintAnchor);

    public static native NativeGuidanceHint createFull(NativeGuidanceHintStyle nativeGuidanceHintStyle, String str, NativeGuidanceHintAnchor nativeGuidanceHintAnchor, NativeGuidanceHintLayout nativeGuidanceHintLayout, NativeGuidanceHintIcon nativeGuidanceHintIcon, String str2, boolean z10);

    public abstract NativeHintStyle getHintStyle();

    public abstract String getText();
}
