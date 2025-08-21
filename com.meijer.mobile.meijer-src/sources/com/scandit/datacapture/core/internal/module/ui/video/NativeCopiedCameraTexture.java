package com.scandit.datacapture.core.internal.module.ui.video;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeCopiedCameraTexture {

    @DjinniGenerated
    public static final class CppProxy extends NativeCopiedCameraTexture {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126266a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native int native_getTextureId(long j10);

        private native void native_releaseGlResources(long j10);

        private native void native_update(long j10, Size2 size2, int i10, ArrayList<Float> arrayList);

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture
        public int getTextureId() {
            return native_getTextureId(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture
        public void releaseGlResources() {
            native_releaseGlResources(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture
        public void update(Size2 size2, int i10, ArrayList<Float> arrayList) {
            native_update(this.nativeRef, size2, i10, arrayList);
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

    public static native NativeCopiedCameraTexture create();

    public abstract int getTextureId();

    public abstract void releaseGlResources();

    public abstract void update(Size2 size2, int i10, ArrayList<Float> arrayList);
}
