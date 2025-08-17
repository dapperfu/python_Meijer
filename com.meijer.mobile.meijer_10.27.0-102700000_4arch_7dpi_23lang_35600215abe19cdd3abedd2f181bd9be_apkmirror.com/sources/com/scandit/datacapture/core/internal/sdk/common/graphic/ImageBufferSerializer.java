package com.scandit.datacapture.core.internal.sdk.common.graphic;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/graphic/ImageBufferSerializer;", "", "Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;", "buffer", "Lorg/json/JSONObject;", "toJsonObject", "(Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;)Lorg/json/JSONObject;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ImageBufferSerializer {
    public static final ImageBufferSerializer INSTANCE = new ImageBufferSerializer();

    @JvmStatic
    public static final JSONObject toJsonObject(ImageBuffer buffer) throws JSONException {
        Intrinsics.j(buffer, "buffer");
        JSONObject jSONObjectPut = new JSONObject().put("height", buffer.getHeight()).put("width", buffer.getWidth()).put("data", BitmapExtensionsKt.toBase64(buffer.toBitmap()));
        Intrinsics.i(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    private ImageBufferSerializer() {
    }
}
