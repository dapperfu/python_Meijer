package com.scandit.datacapture.core.common.graphic;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.nio.ByteBuffer;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class ImagePlane {
    final Channel channel;
    final ByteBuffer data;
    final int pixelStride;
    final int rowStride;
    final int subsamplingX;
    final int subsamplingY;

    public Channel getChannel() {
        return this.channel;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getPixelStride() {
        return this.pixelStride;
    }

    public int getRowStride() {
        return this.rowStride;
    }

    public int getSubsamplingX() {
        return this.subsamplingX;
    }

    public int getSubsamplingY() {
        return this.subsamplingY;
    }

    public String toString() {
        return "ImagePlane{channel=" + this.channel + ",subsamplingX=" + this.subsamplingX + ",subsamplingY=" + this.subsamplingY + ",rowStride=" + this.rowStride + ",pixelStride=" + this.pixelStride + ",data=" + this.data + "}";
    }

    public ImagePlane(Channel channel, int i10, int i11, int i12, int i13, ByteBuffer byteBuffer) {
        this.channel = channel;
        this.subsamplingX = i10;
        this.subsamplingY = i11;
        this.rowStride = i12;
        this.pixelStride = i13;
        this.data = byteBuffer;
    }
}
