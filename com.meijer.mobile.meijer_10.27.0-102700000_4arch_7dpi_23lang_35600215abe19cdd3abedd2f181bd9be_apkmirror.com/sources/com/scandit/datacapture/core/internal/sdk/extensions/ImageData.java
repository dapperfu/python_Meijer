package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.internal.module.source.DirectByteBufferCache;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/extensions/ImageData;", "Ljava/lang/AutoCloseable;", "Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;", "yPlane", "uPlane", "vPlane", "Lcom/scandit/datacapture/core/internal/module/source/DirectByteBufferCache;", "directByteBufferCache", "", "Ljava/nio/ByteBuffer;", "allocated", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;Lcom/scandit/datacapture/core/internal/module/source/DirectByteBufferCache;Ljava/util/List;)V", "", "close", "()V", "a", "Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;", "getYPlane", "()Lcom/scandit/datacapture/core/internal/sdk/extensions/ImagePlane;", "b", "getUPlane", "c", "getVPlane", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ImageData implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImagePlane yPlane;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImagePlane uPlane;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImagePlane vPlane;

    /* renamed from: d, reason: collision with root package name */
    private final DirectByteBufferCache f125463d;

    /* renamed from: e, reason: collision with root package name */
    private final List f125464e;

    public ImageData(ImagePlane yPlane, ImagePlane uPlane, ImagePlane vPlane, DirectByteBufferCache directByteBufferCache, List<? extends ByteBuffer> list) {
        Intrinsics.j(yPlane, "yPlane");
        Intrinsics.j(uPlane, "uPlane");
        Intrinsics.j(vPlane, "vPlane");
        this.yPlane = yPlane;
        this.uPlane = uPlane;
        this.vPlane = vPlane;
        this.f125463d = directByteBufferCache;
        this.f125464e = list;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        List<ByteBuffer> list = this.f125464e;
        if (list != null) {
            for (ByteBuffer byteBuffer : list) {
                DirectByteBufferCache directByteBufferCache = this.f125463d;
                if (directByteBufferCache != null) {
                    directByteBufferCache.a(byteBuffer);
                }
            }
        }
    }

    public final ImagePlane getUPlane() {
        return this.uPlane;
    }

    public final ImagePlane getVPlane() {
        return this.vPlane;
    }

    public final ImagePlane getYPlane() {
        return this.yPlane;
    }
}
