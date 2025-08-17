package com.scandit.datacapture.core.internal.sdk.extensions;

import android.media.Image;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.graphic.Channel;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.module.source.BufferStack;
import com.scandit.datacapture.core.internal.module.source.DirectByteBufferCache;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a^\u0010\u0015\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aX\u0010\u0019\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0015\u0010 \u001a\u00020\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0018\u0010!\u001a\u00020\r*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "", "toNv21Bytes", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)[B", "Landroid/media/Image;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameData;", "frameData", "Lcom/scandit/datacapture/core/internal/module/source/DirectByteBufferCache;", "directByteBufferCache", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameDataPool;", "pool", "", "captureDeviceOrientation", "", "isImageMirrored", "isTimestampRealtime", "Lkotlin/Function1;", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeCameraCaptureParameters;", "", "Lkotlin/ExtensionFunctionType;", "initParameters", "updateFrameData", "(Landroid/media/Image;Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameData;Lcom/scandit/datacapture/core/internal/module/source/DirectByteBufferCache;Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameDataPool;IZZLkotlin/jvm/functions/Function1;)Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameData;", "Lcom/scandit/datacapture/core/internal/module/source/BufferStack;", "buffers", "convertToFrameData", "(Landroid/media/Image;Lcom/scandit/datacapture/core/internal/module/source/BufferStack;Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameDataPool;IZZLkotlin/jvm/functions/Function1;)Lcom/scandit/datacapture/core/internal/sdk/source/NativeCameraFrameData;", "Lcom/scandit/datacapture/core/internal/sdk/extensions/ImageData;", "toImageData", "(Landroid/media/Image;Lcom/scandit/datacapture/core/internal/module/source/DirectByteBufferCache;)Lcom/scandit/datacapture/core/internal/sdk/extensions/ImageData;", "getNv21BytesSize", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)I", "nv21BytesSize", "isUsingDirectBuffers", "(Landroid/media/Image;)Z", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ImageExtensionsKt {
    public static final NativeCameraFrameData convertToFrameData(Image image, BufferStack buffers, NativeCameraFrameDataPool pool, int i10, boolean z10, boolean z11, Function1<? super NativeCameraCaptureParameters, Unit> initParameters) {
        Intrinsics.j(image, "<this>");
        Intrinsics.j(buffers, "buffers");
        Intrinsics.j(pool, "pool");
        Intrinsics.j(initParameters, "initParameters");
        Long lValueOf = z11 ? Long.valueOf(image.getTimestamp()) : null;
        if (buffers.isEmpty()) {
            return null;
        }
        Image.Plane plane = image.getPlanes()[0];
        Image.Plane plane2 = image.getPlanes()[1];
        Image.Plane plane3 = image.getPlanes()[2];
        ByteBuffer buffer = plane.getBuffer();
        ByteBuffer buffer2 = plane2.getBuffer();
        ByteBuffer buffer3 = plane3.getBuffer();
        buffer.position(0);
        buffer2.position(0);
        buffer3.position(0);
        int width = image.getWidth();
        int height = image.getHeight();
        byte[] bArrA = buffers.a(buffer3.remaining() + buffer2.remaining() + buffer.remaining());
        int pixelStride = plane2.getPixelStride();
        int rowStride = plane.getRowStride();
        int rowStride2 = plane2.getRowStride();
        NativeAxis nativeAxis = z10 ? NativeAxis.Y : NativeAxis.NONE;
        NativeCameraCaptureParameters nativeCameraCaptureParametersCreate = NativeCameraCaptureParameters.create();
        initParameters.invoke(nativeCameraCaptureParametersCreate);
        return NativeCameraFrameData.createNv21FrameData(width, height, bArrA, buffer, buffer2, buffer3, pixelStride, rowStride, rowStride2, pool, i10, nativeAxis, nativeCameraCaptureParametersCreate, lValueOf);
    }

    public static /* synthetic */ NativeCameraFrameData convertToFrameData$default(Image image, BufferStack bufferStack, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i10, boolean z10, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            function1 = a.f125470a;
        }
        return convertToFrameData(image, bufferStack, nativeCameraFrameDataPool, i10, z10, z11, function1);
    }

    public static final int getNv21BytesSize(NativeImageBuffer nativeImageBuffer) {
        Intrinsics.j(nativeImageBuffer, "<this>");
        return ((nativeImageBuffer.getHeight() * nativeImageBuffer.getWidth()) * 12) / 8;
    }

    public static final boolean isUsingDirectBuffers(Image image) {
        Intrinsics.j(image, "<this>");
        return image.getPlanes()[0].getBuffer().isDirect() && image.getPlanes()[1].getBuffer().isDirect() && image.getPlanes()[2].getBuffer().isDirect();
    }

    public static final ImageData toImageData(Image image, DirectByteBufferCache directByteBufferCache) {
        Intrinsics.j(image, "<this>");
        Intrinsics.j(directByteBufferCache, "directByteBufferCache");
        if (isUsingDirectBuffers(image)) {
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            Intrinsics.i(buffer, "getBuffer(...)");
            ImagePlane imagePlane = new ImagePlane(buffer, image.getPlanes()[0].getRowStride(), image.getPlanes()[0].getPixelStride());
            ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
            Intrinsics.i(buffer2, "getBuffer(...)");
            ImagePlane imagePlane2 = new ImagePlane(buffer2, image.getPlanes()[1].getRowStride(), image.getPlanes()[1].getPixelStride());
            ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
            Intrinsics.i(buffer3, "getBuffer(...)");
            return new ImageData(imagePlane, imagePlane2, new ImagePlane(buffer3, image.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride()), null, null);
        }
        ByteBuffer buffer4 = image.getPlanes()[0].getBuffer();
        ByteBuffer buffer5 = image.getPlanes()[1].getBuffer();
        ByteBuffer buffer6 = image.getPlanes()[2].getBuffer();
        ByteBuffer byteBufferA = directByteBufferCache.a(buffer4.capacity());
        Intrinsics.g(buffer4);
        ByteBuffer byteBufferA2 = a(byteBufferA, buffer4);
        ByteBuffer byteBufferA3 = directByteBufferCache.a(buffer5.capacity() + 1);
        int iCapacity = buffer5.capacity();
        int iPosition = byteBufferA3.position();
        int iLimit = byteBufferA3.limit();
        byteBufferA3.position(0);
        byteBufferA3.limit(iCapacity);
        ByteBuffer byteBufferSlice = byteBufferA3.slice();
        byteBufferA3.limit(iLimit);
        byteBufferA3.position(iPosition);
        Intrinsics.g(byteBufferSlice);
        Intrinsics.g(buffer5);
        ByteBuffer byteBufferA4 = a(byteBufferSlice, buffer5);
        int iCapacity2 = buffer6.capacity();
        int iPosition2 = byteBufferA3.position();
        int iLimit2 = byteBufferA3.limit();
        byteBufferA3.position(1);
        byteBufferA3.limit(iCapacity2 + 1);
        ByteBuffer byteBufferSlice2 = byteBufferA3.slice();
        byteBufferA3.limit(iLimit2);
        byteBufferA3.position(iPosition2);
        Intrinsics.g(byteBufferSlice2);
        Intrinsics.g(buffer6);
        return new ImageData(new ImagePlane(byteBufferA2, image.getPlanes()[0].getRowStride(), image.getPlanes()[0].getPixelStride()), new ImagePlane(byteBufferA4, image.getPlanes()[1].getRowStride(), image.getPlanes()[1].getPixelStride()), new ImagePlane(a(byteBufferSlice2, buffer6), image.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride()), directByteBufferCache, CollectionsKt.p(byteBufferA2, byteBufferA3));
    }

    public static final byte[] toNv21Bytes(NativeImageBuffer nativeImageBuffer) {
        Intrinsics.j(nativeImageBuffer, "<this>");
        ArrayList<com.scandit.datacapture.core.common.graphic.ImagePlane> planes = nativeImageBuffer.getPlanes();
        if (planes.size() != 3) {
            throw new IllegalStateException("image buffer must contain YUV planes");
        }
        if (planes.get(0).getChannel() != Channel.Y) {
            throw new IllegalStateException("image buffer must contain YUV planes");
        }
        if (planes.get(1).getChannel() != Channel.U) {
            throw new IllegalStateException("image buffer must contain YUV planes");
        }
        if (planes.get(2).getChannel() != Channel.V) {
            throw new IllegalStateException("image buffer must contain YUV planes");
        }
        try {
            byte[] bArrArray = ByteBuffer.allocate(getNv21BytesSize(nativeImageBuffer)).put(planes.get(0).getData()).put(planes.get(2).getData()).array();
            Intrinsics.g(bArrArray);
            return bArrArray;
        } catch (Exception unused) {
            byte[] bitmapRepresentationFromYUV = nativeImageBuffer.getBitmapRepresentationFromYUV(new Rect(new Point(0.0f, 0.0f), new Size2(nativeImageBuffer.getWidth(), nativeImageBuffer.getHeight())));
            Intrinsics.g(bitmapRepresentationFromYUV);
            return bitmapRepresentationFromYUV;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:7:0x0035, B:9:0x006b, B:19:0x007c, B:21:0x0082, B:24:0x008f, B:26:0x00b1, B:28:0x00b6, B:27:0x00b4, B:23:0x008a, B:18:0x007a), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:7:0x0035, B:9:0x006b, B:19:0x007c, B:21:0x0082, B:24:0x008f, B:26:0x00b1, B:28:0x00b6, B:27:0x00b4, B:23:0x008a, B:18:0x007a), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:7:0x0035, B:9:0x006b, B:19:0x007c, B:21:0x0082, B:24:0x008f, B:26:0x00b1, B:28:0x00b6, B:27:0x00b4, B:23:0x008a, B:18:0x007a), top: B:41:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:7:0x0035, B:9:0x006b, B:19:0x007c, B:21:0x0082, B:24:0x008f, B:26:0x00b1, B:28:0x00b6, B:27:0x00b4, B:23:0x008a, B:18:0x007a), top: B:41:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData updateFrameData(android.media.Image r17, com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData r18, com.scandit.datacapture.core.internal.module.source.DirectByteBufferCache r19, com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool r20, int r21, boolean r22, boolean r23, kotlin.jvm.functions.Function1<? super com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters, kotlin.Unit> r24) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r24
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r0, r4)
            java.lang.String r4 = "frameData"
            kotlin.jvm.internal.Intrinsics.j(r1, r4)
            java.lang.String r4 = "directByteBufferCache"
            kotlin.jvm.internal.Intrinsics.j(r2, r4)
            java.lang.String r4 = "pool"
            r10 = r20
            kotlin.jvm.internal.Intrinsics.j(r10, r4)
            java.lang.String r4 = "initParameters"
            kotlin.jvm.internal.Intrinsics.j(r3, r4)
            r15 = 0
            if (r23 == 0) goto L30
            long r4 = r0.getTimestamp()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r14 = r4
            goto L31
        L30:
            r14 = r15
        L31:
            com.scandit.datacapture.core.internal.sdk.extensions.ImageData r2 = toImageData(r0, r2)
            com.scandit.datacapture.core.internal.sdk.extensions.ImagePlane r4 = r2.getYPlane()     // Catch: java.lang.Throwable -> L76
            java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch: java.lang.Throwable -> L76
            com.scandit.datacapture.core.internal.sdk.extensions.ImagePlane r5 = r2.getUPlane()     // Catch: java.lang.Throwable -> L76
            java.nio.ByteBuffer r5 = r5.getBuffer()     // Catch: java.lang.Throwable -> L76
            com.scandit.datacapture.core.internal.sdk.extensions.ImagePlane r6 = r2.getVPlane()     // Catch: java.lang.Throwable -> L76
            java.nio.ByteBuffer r6 = r6.getBuffer()     // Catch: java.lang.Throwable -> L76
            r7 = 0
            r4.position(r7)     // Catch: java.lang.Throwable -> L76
            r5.position(r7)     // Catch: java.lang.Throwable -> L76
            r6.position(r7)     // Catch: java.lang.Throwable -> L76
            int r7 = r4.remaining()     // Catch: java.lang.Throwable -> L76
            int r8 = r5.remaining()     // Catch: java.lang.Throwable -> L76
            int r7 = r7 + r8
            int r8 = r6.remaining()     // Catch: java.lang.Throwable -> L76
            int r7 = r7 + r8
            byte[] r8 = r1.takeBuffer()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L7a
            kotlin.jvm.internal.Intrinsics.g(r8)     // Catch: java.lang.Throwable -> L76
            int r9 = r8.length     // Catch: java.lang.Throwable -> L76
            if (r9 != r7) goto L72
            goto L73
        L72:
            r8 = r15
        L73:
            if (r8 != 0) goto L7c
            goto L7a
        L76:
            r0 = move-exception
            r1 = r2
        L78:
            r2 = r0
            goto Ld0
        L7a:
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L76
        L7c:
            com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters r7 = r1.getCaptureParameters()     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L8a
            kotlin.jvm.internal.Intrinsics.g(r7)     // Catch: java.lang.Throwable -> L76
            r7.clear()     // Catch: java.lang.Throwable -> L76
        L88:
            r13 = r7
            goto L8f
        L8a:
            com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters r7 = com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters.create()     // Catch: java.lang.Throwable -> L76
            goto L88
        L8f:
            int r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L76
            int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> L76
            com.scandit.datacapture.core.internal.sdk.extensions.ImagePlane r7 = r2.getUPlane()     // Catch: java.lang.Throwable -> L76
            int r7 = r7.getPixelStride()     // Catch: java.lang.Throwable -> L76
            com.scandit.datacapture.core.internal.sdk.extensions.ImagePlane r9 = r2.getYPlane()     // Catch: java.lang.Throwable -> L76
            int r9 = r9.getRowStride()     // Catch: java.lang.Throwable -> L76
            com.scandit.datacapture.core.internal.sdk.extensions.ImagePlane r11 = r2.getUPlane()     // Catch: java.lang.Throwable -> L76
            int r11 = r11.getRowStride()     // Catch: java.lang.Throwable -> L76
            if (r22 == 0) goto Lb4
            com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis r12 = com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis.Y     // Catch: java.lang.Throwable -> L76
            goto Lb6
        Lb4:
            com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis r12 = com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis.NONE     // Catch: java.lang.Throwable -> L76
        Lb6:
            r3.invoke(r13)     // Catch: java.lang.Throwable -> L76
            r16 = r2
            r3 = r8
            r8 = r9
            r9 = r11
            r11 = r21
            r2 = r0
            r0 = r18
            r0.updateNv21(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lcc
            r1 = r16
            kotlin.jdk7.AutoCloseableKt.a(r1, r15)
            return r18
        Lcc:
            r0 = move-exception
            r1 = r16
            goto L78
        Ld0:
            throw r2     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r0 = move-exception
            kotlin.jdk7.AutoCloseableKt.a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.sdk.extensions.ImageExtensionsKt.updateFrameData(android.media.Image, com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData, com.scandit.datacapture.core.internal.module.source.DirectByteBufferCache, com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameDataPool, int, boolean, boolean, kotlin.jvm.functions.Function1):com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData");
    }

    private static final ByteBuffer a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer2.capacity();
        byteBuffer.capacity();
        byteBuffer.position(0);
        byteBuffer2.position(0);
        byteBuffer.put(byteBuffer2);
        return byteBuffer;
    }
}
