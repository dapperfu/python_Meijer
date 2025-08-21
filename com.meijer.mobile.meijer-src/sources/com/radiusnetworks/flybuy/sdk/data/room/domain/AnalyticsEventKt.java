package com.radiusnetworks.flybuy.sdk.data.room.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toApiAnalyticsEvent", "Lcom/radiusnetworks/flybuy/api/model/AnalyticsEvent;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticsEventKt {
    public static final com.radiusnetworks.flybuy.api.model.AnalyticsEvent toApiAnalyticsEvent(AnalyticsEvent analyticsEvent) {
        Intrinsics.j(analyticsEvent, "<this>");
        String guid = analyticsEvent.getGuid();
        String name = analyticsEvent.getName();
        String string = analyticsEvent.getOccurredAt().toString();
        Intrinsics.i(string, "toString(...)");
        return new com.radiusnetworks.flybuy.api.model.AnalyticsEvent(guid, name, string, analyticsEvent.getProjectId(), analyticsEvent.getOrderId(), analyticsEvent.getPromotionId(), analyticsEvent.getShortLinkId(), analyticsEvent.getSiteId(), analyticsEvent.getData());
    }
}
