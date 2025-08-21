package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeRectangularViewfinderAnimation {

    @DjinniGenerated
    public static final class CppProxy extends NativeRectangularViewfinderAnimation {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126773a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native boolean native_isLooping(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation
        public boolean isLooping() {
            return native_isLooping(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation
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

    public static native NativeRectangularViewfinderAnimation create(boolean z10);

    public abstract boolean isLooping();

    public abstract String toJson();
}
