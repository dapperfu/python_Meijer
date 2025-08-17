package com.scandit.datacapture.core.common.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Size2Deserializer;", "", "", "json", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/common/geometry/Size2;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class Size2Deserializer {
    public static final Size2Deserializer INSTANCE = new Size2Deserializer();

    public final Size2 fromJson(String json) {
        Intrinsics.j(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        return new Size2((float) jSONObject.getDouble("width"), (float) jSONObject.getDouble("height"));
    }

    private Size2Deserializer() {
    }
}
