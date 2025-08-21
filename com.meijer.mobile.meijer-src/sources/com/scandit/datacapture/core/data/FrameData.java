package com.scandit.datacapture.core.data;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H¦\u0002J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/data/FrameData;", "", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "equals", "", "other", "getImageBuffer", "Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;", "getOrientation", "", "getTimestamp", "", "hashCode", "release", "", "retain", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(provided = true, value = NativeFrameData.class)
/* loaded from: classes12.dex */
public interface FrameData {
    NativeFrameData _impl();

    boolean equals(Object other);

    ImageBuffer getImageBuffer();

    int getOrientation();

    long getTimestamp();

    int hashCode();

    void release();

    void retain();
}
