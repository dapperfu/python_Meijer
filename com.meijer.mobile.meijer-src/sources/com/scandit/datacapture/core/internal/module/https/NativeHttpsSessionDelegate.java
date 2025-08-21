package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeHttpsSessionDelegate {

    @DjinniGenerated
    public static final class CppProxy extends NativeHttpsSessionDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125627a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_didComplete(long j10, NativeHttpsSession nativeHttpsSession, NativeHttpsTask nativeHttpsTask);

        @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionDelegate
        public void didComplete(NativeHttpsSession nativeHttpsSession, NativeHttpsTask nativeHttpsTask) {
            native_didComplete(this.nativeRef, nativeHttpsSession, nativeHttpsTask);
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

    public abstract void didComplete(NativeHttpsSession nativeHttpsSession, NativeHttpsTask nativeHttpsTask);
}
