package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J|\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0016¨\u0006-"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AnalyticsEvent;", "", "guid", "", "eventName", "occurredAt", "projectId", "", "orderId", "promotionId", "shortLinkId", "siteId", "data", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getEventName", "()Ljava/lang/String;", "getGuid", "getOccurredAt", "getOrderId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProjectId", "()I", "getPromotionId", "getShortLinkId", "getSiteId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lcom/radiusnetworks/flybuy/api/model/AnalyticsEvent;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AnalyticsEvent {
    private final Map<String, String> data;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_EVENT_NAME)
    private final String eventName;
    private final String guid;

    @InterfaceC16127c("occurred_at")
    private final String occurredAt;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_ORDER_ID)
    private final Integer orderId;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_PROJECT_ID)
    private final int projectId;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_PROMOTION_ID)
    private final Integer promotionId;

    @InterfaceC16127c("short_link_id")
    private final Integer shortLinkId;

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_SITE_ID)
    private final Integer siteId;

    public static /* synthetic */ AnalyticsEvent copy$default(AnalyticsEvent analyticsEvent, String str, String str2, String str3, int i10, Integer num, Integer num2, Integer num3, Integer num4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsEvent.guid;
        }
        if ((i11 & 2) != 0) {
            str2 = analyticsEvent.eventName;
        }
        if ((i11 & 4) != 0) {
            str3 = analyticsEvent.occurredAt;
        }
        if ((i11 & 8) != 0) {
            i10 = analyticsEvent.projectId;
        }
        if ((i11 & 16) != 0) {
            num = analyticsEvent.orderId;
        }
        if ((i11 & 32) != 0) {
            num2 = analyticsEvent.promotionId;
        }
        if ((i11 & 64) != 0) {
            num3 = analyticsEvent.shortLinkId;
        }
        if ((i11 & 128) != 0) {
            num4 = analyticsEvent.siteId;
        }
        if ((i11 & 256) != 0) {
            map = analyticsEvent.data;
        }
        Integer num5 = num4;
        Map map2 = map;
        Integer num6 = num2;
        Integer num7 = num3;
        Integer num8 = num;
        String str4 = str3;
        return analyticsEvent.copy(str, str2, str4, i10, num8, num6, num7, num5, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOccurredAt() {
        return this.occurredAt;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProjectId() {
        return this.projectId;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOrderId() {
        return this.orderId;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getPromotionId() {
        return this.promotionId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getShortLinkId() {
        return this.shortLinkId;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getSiteId() {
        return this.siteId;
    }

    public final Map<String, String> component9() {
        return this.data;
    }

    public final AnalyticsEvent copy(String guid, String eventName, String occurredAt, int projectId, Integer orderId, Integer promotionId, Integer shortLinkId, Integer siteId, Map<String, String> data) {
        Intrinsics.j(guid, "guid");
        Intrinsics.j(eventName, "eventName");
        Intrinsics.j(occurredAt, "occurredAt");
        Intrinsics.j(data, "data");
        return new AnalyticsEvent(guid, eventName, occurredAt, projectId, orderId, promotionId, shortLinkId, siteId, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) other;
        return Intrinsics.e(this.guid, analyticsEvent.guid) && Intrinsics.e(this.eventName, analyticsEvent.eventName) && Intrinsics.e(this.occurredAt, analyticsEvent.occurredAt) && this.projectId == analyticsEvent.projectId && Intrinsics.e(this.orderId, analyticsEvent.orderId) && Intrinsics.e(this.promotionId, analyticsEvent.promotionId) && Intrinsics.e(this.shortLinkId, analyticsEvent.shortLinkId) && Intrinsics.e(this.siteId, analyticsEvent.siteId) && Intrinsics.e(this.data, analyticsEvent.data);
    }

    public String toString() {
        return "AnalyticsEvent(guid=" + this.guid + ", eventName=" + this.eventName + ", occurredAt=" + this.occurredAt + ", projectId=" + this.projectId + ", orderId=" + this.orderId + ", promotionId=" + this.promotionId + ", shortLinkId=" + this.shortLinkId + ", siteId=" + this.siteId + ", data=" + this.data + ')';
    }

    public AnalyticsEvent(String guid, String eventName, String occurredAt, int i10, Integer num, Integer num2, Integer num3, Integer num4, Map<String, String> data) {
        Intrinsics.j(guid, "guid");
        Intrinsics.j(eventName, "eventName");
        Intrinsics.j(occurredAt, "occurredAt");
        Intrinsics.j(data, "data");
        this.guid = guid;
        this.eventName = eventName;
        this.occurredAt = occurredAt;
        this.projectId = i10;
        this.orderId = num;
        this.promotionId = num2;
        this.shortLinkId = num3;
        this.siteId = num4;
        this.data = data;
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getOccurredAt() {
        return this.occurredAt;
    }

    public final Integer getOrderId() {
        return this.orderId;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final Integer getPromotionId() {
        return this.promotionId;
    }

    public final Integer getShortLinkId() {
        return this.shortLinkId;
    }

    public final Integer getSiteId() {
        return this.siteId;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.projectId) + a.a(this.occurredAt, a.a(this.eventName, this.guid.hashCode() * 31, 31), 31)) * 31;
        Integer num = this.orderId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.promotionId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.shortLinkId;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.siteId;
        return this.data.hashCode() + ((iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }
}
