package com.scandit.datacapture.core.internal.sdk.extensions;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;", "", "Ljava/nio/ByteBuffer;", "buffer", "", "rowStride", "pixelStride", "<init>", "(Ljava/nio/ByteBuffer;II)V", "a", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "b", "I", "getRowStride", "()I", "c", "getPixelStride", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ImagePlane {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ByteBuffer buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int rowStride;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pixelStride;

    public ImagePlane(ByteBuffer buffer, int i10, int i11) {
        Intrinsics.j(buffer, "buffer");
        this.buffer = buffer;
        this.rowStride = i10;
        this.pixelStride = i11;
    }

    public final ByteBuffer getBuffer() {
        return this.buffer;
    }

    public final int getPixelStride() {
        return this.pixelStride;
    }

    public final int getRowStride() {
        return this.rowStride;
    }
}
