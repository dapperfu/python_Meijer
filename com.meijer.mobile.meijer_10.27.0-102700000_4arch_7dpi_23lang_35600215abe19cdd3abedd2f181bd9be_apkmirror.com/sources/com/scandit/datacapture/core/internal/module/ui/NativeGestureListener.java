package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeGestureListener {

    @DjinniGenerated
    public static final class CppProxy extends NativeGestureListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125143a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native boolean native_onDoubleTap(long j10, Point point);

        private native boolean native_onSwipeDown(long j10);

        private native boolean native_onSwipeLeft(long j10);

        private native boolean native_onSwipeRight(long j10);

        private native boolean native_onSwipeUp(long j10);

        private native boolean native_onTap(long j10, Point point);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureListener
        public boolean onDoubleTap(Point point) {
            return native_onDoubleTap(this.nativeRef, point);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureListener
        public boolean onSwipeDown() {
            return native_onSwipeDown(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureListener
        public boolean onSwipeLeft() {
            return native_onSwipeLeft(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureListener
        public boolean onSwipeRight() {
            return native_onSwipeRight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureListener
        public boolean onSwipeUp() {
            return native_onSwipeUp(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeGestureListener
        public boolean onTap(Point point) {
            return native_onTap(this.nativeRef, point);
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

    public abstract boolean onDoubleTap(Point point);

    public abstract boolean onSwipeDown();

    public abstract boolean onSwipeLeft();

    public abstract boolean onSwipeRight();

    public abstract boolean onSwipeUp();

    public abstract boolean onTap(Point point);
}
