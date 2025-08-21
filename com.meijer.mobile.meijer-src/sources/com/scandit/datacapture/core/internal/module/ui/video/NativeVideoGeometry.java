package com.scandit.datacapture.core.internal.module.ui.video;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeVideoGeometry {

    @DjinniGenerated
    public static final class CppProxy extends NativeVideoGeometry {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126268a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native Size2 native_getFrameSize(long j10);

        private native Size2 native_getViewSize(long j10);

        private native void native_setFrameSize(long j10, Size2 size2);

        private native void native_setViewSize(long j10, Size2 size2);

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public Size2 getFrameSize() {
            return native_getFrameSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public Size2 getViewSize() {
            return native_getViewSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public void setFrameSize(Size2 size2) {
            native_setFrameSize(this.nativeRef, size2);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoGeometry
        public void setViewSize(Size2 size2) {
            native_setViewSize(this.nativeRef, size2);
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

    public abstract Size2 getFrameSize();

    public abstract Size2 getViewSize();

    public abstract void setFrameSize(Size2 size2);

    public abstract void setViewSize(Size2 size2);
}
