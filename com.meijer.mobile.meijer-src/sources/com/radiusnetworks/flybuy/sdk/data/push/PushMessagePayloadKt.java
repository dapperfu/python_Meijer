package com.radiusnetworks.flybuy.sdk.data.push;

import com.google.gson.Gson;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"toPushMessagePayload", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushMessagePayload;", "", "", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushMessagePayloadKt {
    public static final PushMessagePayload toPushMessagePayload(Map<String, String> map) {
        Intrinsics.j(map, "<this>");
        if (!map.containsKey(NotificationsManager.INTENT_EXTRA_MESSAGE_SOURCE) || !(map.containsKey(NotificationsManager.INTENT_EXTRA_FLYBUY_MESSAGE_TYPE) | map.containsKey(NotificationsManager.INTENT_EXTRA_ORDER_ID))) {
            return null;
        }
        Gson gson = new Gson();
        return (PushMessagePayload) gson.o(gson.x(map), PushMessagePayload.class);
    }
}
