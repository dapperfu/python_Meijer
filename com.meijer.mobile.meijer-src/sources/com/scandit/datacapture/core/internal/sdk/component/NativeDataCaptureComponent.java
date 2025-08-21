package com.scandit.datacapture.core.internal.sdk.component;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataCaptureComponent {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureComponent {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126389a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_getIdentifier(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent
        public String getIdentifier() {
            return native_getIdentifier(this.nativeRef);
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

    public abstract String getIdentifier();
}
