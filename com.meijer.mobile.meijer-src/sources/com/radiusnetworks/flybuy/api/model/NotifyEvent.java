package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyEvent;", "", "guid", "", "name", "occurredAt", "campaignId", "", "params", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "getCampaignId", "()I", "getGuid", "()Ljava/lang/String;", "getName", "getOccurredAt", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotifyEvent {

    @InterfaceC16127c("campaign_id")
    private final int campaignId;
    private final String guid;
    private final String name;

    @InterfaceC16127c("occurred_at")
    private final String occurredAt;
    private final Map<String, String> params;

    public static /* synthetic */ NotifyEvent copy$default(NotifyEvent notifyEvent, String str, String str2, String str3, int i10, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notifyEvent.guid;
        }
        if ((i11 & 2) != 0) {
            str2 = notifyEvent.name;
        }
        if ((i11 & 4) != 0) {
            str3 = notifyEvent.occurredAt;
        }
        if ((i11 & 8) != 0) {
            i10 = notifyEvent.campaignId;
        }
        if ((i11 & 16) != 0) {
            map = notifyEvent.params;
        }
        Map map2 = map;
        String str4 = str3;
        return notifyEvent.copy(str, str2, str4, i10, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOccurredAt() {
        return this.occurredAt;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    public final Map<String, String> component5() {
        return this.params;
    }

    public final NotifyEvent copy(String guid, String name, String occurredAt, int campaignId, Map<String, String> params) {
        Intrinsics.j(guid, "guid");
        Intrinsics.j(name, "name");
        Intrinsics.j(occurredAt, "occurredAt");
        Intrinsics.j(params, "params");
        return new NotifyEvent(guid, name, occurredAt, campaignId, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyEvent)) {
            return false;
        }
        NotifyEvent notifyEvent = (NotifyEvent) other;
        return Intrinsics.e(this.guid, notifyEvent.guid) && Intrinsics.e(this.name, notifyEvent.name) && Intrinsics.e(this.occurredAt, notifyEvent.occurredAt) && this.campaignId == notifyEvent.campaignId && Intrinsics.e(this.params, notifyEvent.params);
    }

    public String toString() {
        return "NotifyEvent(guid=" + this.guid + ", name=" + this.name + ", occurredAt=" + this.occurredAt + ", campaignId=" + this.campaignId + ", params=" + this.params + ')';
    }

    public NotifyEvent(String guid, String name, String occurredAt, int i10, Map<String, String> params) {
        Intrinsics.j(guid, "guid");
        Intrinsics.j(name, "name");
        Intrinsics.j(occurredAt, "occurredAt");
        Intrinsics.j(params, "params");
        this.guid = guid;
        this.name = name;
        this.occurredAt = occurredAt;
        this.campaignId = i10;
        this.params = params;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOccurredAt() {
        return this.occurredAt;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + ((Integer.hashCode(this.campaignId) + a.a(this.occurredAt, a.a(this.name, this.guid.hashCode() * 31, 31), 31)) * 31);
    }
}
