package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeAimerViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeAimerViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125817a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeViewfinder native_asViewfinder(long j10);

        private native NativeColor native_getDotColor(long j10);

        private native NativeColor native_getFrameColor(long j10);

        private native void native_setDotColor(long j10, NativeColor nativeColor);

        private native void native_setFrameColor(long j10, NativeColor nativeColor);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public NativeColor getDotColor() {
            return native_getDotColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public NativeColor getFrameColor() {
            return native_getFrameColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public void setDotColor(NativeColor nativeColor) {
            native_setDotColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder
        public void setFrameColor(NativeColor nativeColor) {
            native_setFrameColor(this.nativeRef, nativeColor);
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

    public static native NativeAimerViewfinder create();

    public static native NativeColor getDotColorDefault();

    public static native NativeColor getFrameColorDefault();

    public abstract NativeViewfinder asViewfinder();

    public abstract NativeColor getDotColor();

    public abstract NativeColor getFrameColor();

    public abstract void setDotColor(NativeColor nativeColor);

    public abstract void setFrameColor(NativeColor nativeColor);
}
