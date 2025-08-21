package com.scandit.datacapture.core.common.graphic;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\r\u001a\u00020\u000eH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/common/graphic/ImageBufferProxy;", "", "height", "", "getHeight", "()I", "planes", "", "Lcom/scandit/datacapture/core/common/graphic/ImagePlane;", "getPlanes", "()Ljava/util/List;", "width", "getWidth", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeImageBuffer.class)
/* loaded from: classes12.dex */
public interface ImageBufferProxy {
    @NativeImpl
    NativeImageBuffer _impl();

    @ProxyFunction(property = "height")
    int getHeight();

    @ProxyFunction(property = "planes")
    List<ImagePlane> getPlanes();

    @ProxyFunction(property = "width")
    int getWidth();
}
