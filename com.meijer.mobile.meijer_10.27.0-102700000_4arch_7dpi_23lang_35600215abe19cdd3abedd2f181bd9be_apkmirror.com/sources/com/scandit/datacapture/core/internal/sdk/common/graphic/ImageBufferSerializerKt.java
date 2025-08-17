package com.scandit.datacapture.core.internal.sdk.common.graphic;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toJsonObject", "Lorg/json/JSONObject;", "Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageBufferSerializerKt {
    public static final /* synthetic */ JSONObject toJsonObject(ImageBuffer imageBuffer) {
        Intrinsics.j(imageBuffer, "<this>");
        return ImageBufferSerializer.toJsonObject(imageBuffer);
    }
}
