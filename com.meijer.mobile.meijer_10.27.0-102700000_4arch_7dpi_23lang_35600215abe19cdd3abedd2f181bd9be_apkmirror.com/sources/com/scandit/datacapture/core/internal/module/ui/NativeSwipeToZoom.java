package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSwipeToZoom {

    @DjinniGenerated
    public static final class CppProxy extends NativeSwipeToZoom {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125159a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListener(long j10, NativeZoomGestureListener nativeZoomGestureListener);

        private native NativeZoomGesture native_asZoomGesture(long j10);

        private native String native_toJson(long j10);

        private native void native_triggerZoomIn(long j10);

        private native void native_triggerZoomOut(long j10);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public void addListener(NativeZoomGestureListener nativeZoomGestureListener) {
            native_addListener(this.nativeRef, nativeZoomGestureListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public NativeZoomGesture asZoomGesture() {
            return native_asZoomGesture(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public String toJson() {
            return native_toJson(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public void triggerZoomIn() {
            native_triggerZoomIn(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom
        public void triggerZoomOut() {
            native_triggerZoomOut(this.nativeRef);
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

    public static native NativeSwipeToZoom create();

    public abstract void addListener(NativeZoomGestureListener nativeZoomGestureListener);

    public abstract NativeZoomGesture asZoomGesture();

    public abstract String toJson();

    public abstract void triggerZoomIn();

    public abstract void triggerZoomOut();
}
