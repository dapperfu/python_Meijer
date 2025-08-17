package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeHintPresenterV2 {

    @DjinniGenerated
    public static final class CppProxy extends NativeHintPresenterV2 {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125156a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_hideAllToasts(long j10);

        private native void native_hideCurrentGuidance(long j10);

        private native void native_hideToast(long j10, String str);

        private native void native_showGuidance(long j10, NativeGuidanceHint nativeGuidanceHint);

        private native void native_showToast(long j10, NativeToastHint nativeToastHint);

        private native void native_update(long j10);

        private native void native_userWantsToHideGuidance(long j10, NativeGuidanceHint nativeGuidanceHint);

        private native void native_userWantsToHideToast(long j10, NativeToastHint nativeToastHint);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void hideAllToasts() {
            native_hideAllToasts(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void hideCurrentGuidance() {
            native_hideCurrentGuidance(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void hideToast(String str) {
            native_hideToast(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void showGuidance(NativeGuidanceHint nativeGuidanceHint) {
            native_showGuidance(this.nativeRef, nativeGuidanceHint);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void showToast(NativeToastHint nativeToastHint) {
            native_showToast(this.nativeRef, nativeToastHint);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void update() {
            native_update(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void userWantsToHideGuidance(NativeGuidanceHint nativeGuidanceHint) {
            native_userWantsToHideGuidance(this.nativeRef, nativeGuidanceHint);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2
        public void userWantsToHideToast(NativeToastHint nativeToastHint) {
            native_userWantsToHideToast(this.nativeRef, nativeToastHint);
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

    public static native NativeHintPresenterV2 create(NativePlatformHintPresenter nativePlatformHintPresenter);

    public abstract void hideAllToasts();

    public abstract void hideCurrentGuidance();

    public abstract void hideToast(String str);

    public abstract void showGuidance(NativeGuidanceHint nativeGuidanceHint);

    public abstract void showToast(NativeToastHint nativeToastHint);

    public abstract void update();

    public abstract void userWantsToHideGuidance(NativeGuidanceHint nativeGuidanceHint);

    public abstract void userWantsToHideToast(NativeToastHint nativeToastHint);
}
