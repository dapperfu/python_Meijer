package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSingleBitmapFrameDataCollection {

    @DjinniGenerated
    public static final class CppProxy extends NativeSingleBitmapFrameDataCollection {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125512a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeFrameData native_get(long j10, int i10);

        private native int native_getSize(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection
        public NativeFrameData get(int i10) {
            return native_get(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection
        public int getSize() {
            return native_getSize(this.nativeRef);
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

    public static native NativeSingleBitmapFrameDataCollection create(NativeBitmapInfo nativeBitmapInfo);

    public abstract NativeFrameData get(int i10);

    public abstract int getSize();
}
