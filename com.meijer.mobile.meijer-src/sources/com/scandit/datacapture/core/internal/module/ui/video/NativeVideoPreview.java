package com.scandit.datacapture.core.internal.module.ui.video;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeTextureBinding;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeVideoPreview {

    @DjinniGenerated
    public static final class CppProxy extends NativeVideoPreview {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126269a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeVideoGeometryListener native_asVideoGeometryListener(long j10);

        private native void native_draw(long j10, NativePreviewShaderFormat nativePreviewShaderFormat, ArrayList<NativeTextureBinding> arrayList, NativeVideoGeometry nativeVideoGeometry);

        private native void native_prepareForFormat(long j10, NativePreviewShaderFormat nativePreviewShaderFormat);

        private native void native_releaseGlResources(long j10);

        private native void native_setTextureCoordinateTransformation(long j10, ArrayList<Float> arrayList);

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview
        public NativeVideoGeometryListener asVideoGeometryListener() {
            return native_asVideoGeometryListener(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview
        public void draw(NativePreviewShaderFormat nativePreviewShaderFormat, ArrayList<NativeTextureBinding> arrayList, NativeVideoGeometry nativeVideoGeometry) {
            native_draw(this.nativeRef, nativePreviewShaderFormat, arrayList, nativeVideoGeometry);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview
        public void prepareForFormat(NativePreviewShaderFormat nativePreviewShaderFormat) {
            native_prepareForFormat(this.nativeRef, nativePreviewShaderFormat);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview
        public void releaseGlResources() {
            native_releaseGlResources(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.video.NativeVideoPreview
        public void setTextureCoordinateTransformation(ArrayList<Float> arrayList) {
            native_setTextureCoordinateTransformation(this.nativeRef, arrayList);
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

    public static native NativeVideoPreview create();

    public abstract NativeVideoGeometryListener asVideoGeometryListener();

    public abstract void draw(NativePreviewShaderFormat nativePreviewShaderFormat, ArrayList<NativeTextureBinding> arrayList, NativeVideoGeometry nativeVideoGeometry);

    public abstract void prepareForFormat(NativePreviewShaderFormat nativePreviewShaderFormat);

    public abstract void releaseGlResources();

    public abstract void setTextureCoordinateTransformation(ArrayList<Float> arrayList);
}
