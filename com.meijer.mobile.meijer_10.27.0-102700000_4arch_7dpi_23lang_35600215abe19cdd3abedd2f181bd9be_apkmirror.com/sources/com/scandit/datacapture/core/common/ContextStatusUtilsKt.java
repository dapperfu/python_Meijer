package com.scandit.datacapture.core.common;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/core/common/ContextStatus;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContextStatusUtilsKt {
    public static final /* synthetic */ String toJson(ContextStatus contextStatus) {
        Intrinsics.j(contextStatus, "<this>");
        String strContextStatusToJson = NativeStructSerializer.contextStatusToJson(contextStatus._impl$scandit_capture_core());
        Intrinsics.i(strContextStatusToJson, "contextStatusToJson(...)");
        return strContextStatusToJson;
    }
}
