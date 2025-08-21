package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeNoViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeNoViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126771a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeViewfinder native_asViewfinder(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeNoViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
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

    public static native NativeNoViewfinder create();

    public abstract NativeViewfinder asViewfinder();
}
