package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.graphic.ImagePlane;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeImageBuffer {

    @DjinniGenerated
    public static final class CppProxy extends NativeImageBuffer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126363a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeImageBuffer native_deepCopy(long j10);

        private native byte[] native_getBitmapRepresentationFromYUV(long j10, Rect rect);

        private native int native_getHeight(long j10);

        private native ArrayList<ImagePlane> native_getPlanes(long j10);

        private native int native_getWidth(long j10);

        private native byte[] native_toBitmap(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer
        public NativeImageBuffer deepCopy() {
            return native_deepCopy(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer
        public byte[] getBitmapRepresentationFromYUV(Rect rect) {
            return native_getBitmapRepresentationFromYUV(this.nativeRef, rect);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer
        public int getHeight() {
            return native_getHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer
        public ArrayList<ImagePlane> getPlanes() {
            return native_getPlanes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer
        public int getWidth() {
            return native_getWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer
        public byte[] toBitmap() {
            return native_toBitmap(this.nativeRef);
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

    public static native NativeImageBuffer create(int i10, int i11, ArrayList<ImagePlane> arrayList);

    public abstract NativeImageBuffer deepCopy();

    public abstract byte[] getBitmapRepresentationFromYUV(Rect rect);

    public abstract int getHeight();

    public abstract ArrayList<ImagePlane> getPlanes();

    public abstract int getWidth();

    public abstract byte[] toBitmap();
}
