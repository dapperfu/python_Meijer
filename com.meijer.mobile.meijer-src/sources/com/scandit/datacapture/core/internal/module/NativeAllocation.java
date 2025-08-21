package com.scandit.datacapture.core.internal.module;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeAllocation {

    @DjinniGenerated
    public static final class CppProxy extends NativeAllocation {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125156a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native ByteBuffer native_getBuffer(long j10);

        private native void native_release(long j10);

        @Override // com.scandit.datacapture.core.internal.module.NativeAllocation
        public ByteBuffer getBuffer() {
            return native_getBuffer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.NativeAllocation
        public void release() {
            native_release(this.nativeRef);
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

    public static native NativeAllocation allocate(int i10);

    public abstract ByteBuffer getBuffer();

    public abstract void release();
}
