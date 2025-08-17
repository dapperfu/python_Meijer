package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeAbstractCamera {

    @DjinniGenerated
    public static final class CppProxy extends NativeAbstractCamera {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124799a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeFrameSource native_asFrameSource(long j10);

        private native void native_flushPendingTasks(long j10);

        @Override // com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera
        public NativeFrameSource asFrameSource() {
            return native_asFrameSource(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera
        public void flushPendingTasks() {
            native_flushPendingTasks(this.nativeRef);
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

    public abstract NativeFrameSource asFrameSource();

    public abstract void flushPendingTasks();
}
