package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeCameraCaptureParameters {

    @DjinniGenerated
    public static final class CppProxy extends NativeCameraCaptureParameters {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126397a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_clear(long j10);

        private native long native_getInt64ForKeyOr(long j10, NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, long j11);

        private native void native_insertBool(long j10, NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, boolean z10);

        private native void native_insertFloat(long j10, NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, float f10);

        private native void native_insertInt64(long j10, NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, long j11);

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters
        public void clear() {
            native_clear(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters
        public long getInt64ForKeyOr(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, long j10) {
            return native_getInt64ForKeyOr(this.nativeRef, nativeCameraCaptureParameterKey, j10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters
        public void insertBool(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, boolean z10) {
            native_insertBool(this.nativeRef, nativeCameraCaptureParameterKey, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters
        public void insertFloat(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, float f10) {
            native_insertFloat(this.nativeRef, nativeCameraCaptureParameterKey, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters
        public void insertInt64(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, long j10) {
            native_insertInt64(this.nativeRef, nativeCameraCaptureParameterKey, j10);
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

    public static native NativeCameraCaptureParameters create();

    public abstract void clear();

    public abstract long getInt64ForKeyOr(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, long j10);

    public abstract void insertBool(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, boolean z10);

    public abstract void insertFloat(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, float f10);

    public abstract void insertInt64(NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey, long j10);
}
