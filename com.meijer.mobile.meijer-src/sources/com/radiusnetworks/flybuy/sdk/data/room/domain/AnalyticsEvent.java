package com.radiusnetworks.flybuy.sdk.data.room.domain;

import j$.time.OffsetDateTime;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b \u0010\u001dR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/AnalyticsEvent;", "", "", "guid", "name", "j$/time/OffsetDateTime", "occurredAt", "", "projectId", "orderId", "promotionId", "shortLinkId", "siteId", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/OffsetDateTime;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "Ljava/lang/String;", "getGuid", "()Ljava/lang/String;", "getName", "Lj$/time/OffsetDateTime;", "getOccurredAt", "()Lj$/time/OffsetDateTime;", "I", "getProjectId", "()I", "Ljava/lang/Integer;", "getOrderId", "()Ljava/lang/Integer;", "getPromotionId", "getShortLinkId", "getSiteId", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticsEvent {
    private final Map<String, String> data;
    private final String guid;
    private final String name;
    private final OffsetDateTime occurredAt;
    private final Integer orderId;
    private final int projectId;
    private final Integer promotionId;
    private final Integer shortLinkId;
    private final Integer siteId;

    public AnalyticsEvent(String guid, String name, OffsetDateTime occurredAt, int i10, Integer num, Integer num2, Integer num3, Integer num4, Map<String, String> data) {
        Intrinsics.j(guid, "guid");
        Intrinsics.j(name, "name");
        Intrinsics.j(occurredAt, "occurredAt");
        Intrinsics.j(data, "data");
        this.guid = guid;
        this.name = name;
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

    public final String getGuid() {
        return this.guid;
    }

    public final String getName() {
        return this.name;
    }

    public final OffsetDateTime getOccurredAt() {
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnalyticsEvent(String str, String str2, OffsetDateTime offsetDateTime, int i10, Integer num, Integer num2, Integer num3, Integer num4, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        Map map2;
        Integer num5;
        num = (i11 & 16) != 0 ? null : num;
        num2 = (i11 & 32) != 0 ? null : num2;
        num3 = (i11 & 64) != 0 ? null : num3;
        if ((i11 & 128) != 0) {
            map2 = map;
            num5 = null;
        } else {
            map2 = map;
            num5 = num4;
        }
        this(str, str2, offsetDateTime, i10, num, num2, num3, num5, map2);
    }
}
