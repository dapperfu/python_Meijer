package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsResponse;", "", "minSyncIntervalSeconds", "", "data", "", "Lcom/radiusnetworks/flybuy/api/model/NotifyNotification;", "included", "Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsIncluded;", "(JLjava/util/List;Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsIncluded;)V", "getData", "()Ljava/util/List;", "getIncluded", "()Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsIncluded;", "getMinSyncIntervalSeconds", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetNotifyNotificationsResponse {
    private final List<NotifyNotification> data;
    private final GetNotifyNotificationsIncluded included;

    @InterfaceC15617c("min_sync_interval_seconds")
    private final long minSyncIntervalSeconds;

    public GetNotifyNotificationsResponse(long j10, List<NotifyNotification> list, GetNotifyNotificationsIncluded getNotifyNotificationsIncluded) {
        this.minSyncIntervalSeconds = j10;
        this.data = list;
        this.included = getNotifyNotificationsIncluded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNotifyNotificationsResponse copy$default(GetNotifyNotificationsResponse getNotifyNotificationsResponse, long j10, List list, GetNotifyNotificationsIncluded getNotifyNotificationsIncluded, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = getNotifyNotificationsResponse.minSyncIntervalSeconds;
        }
        if ((i10 & 2) != 0) {
            list = getNotifyNotificationsResponse.data;
        }
        if ((i10 & 4) != 0) {
            getNotifyNotificationsIncluded = getNotifyNotificationsResponse.included;
        }
        return getNotifyNotificationsResponse.copy(j10, list, getNotifyNotificationsIncluded);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMinSyncIntervalSeconds() {
        return this.minSyncIntervalSeconds;
    }

    public final List<NotifyNotification> component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final GetNotifyNotificationsIncluded getIncluded() {
        return this.included;
    }

    public final GetNotifyNotificationsResponse copy(long minSyncIntervalSeconds, List<NotifyNotification> data, GetNotifyNotificationsIncluded included) {
        return new GetNotifyNotificationsResponse(minSyncIntervalSeconds, data, included);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNotifyNotificationsResponse)) {
            return false;
        }
        GetNotifyNotificationsResponse getNotifyNotificationsResponse = (GetNotifyNotificationsResponse) other;
        return this.minSyncIntervalSeconds == getNotifyNotificationsResponse.minSyncIntervalSeconds && Intrinsics.e(this.data, getNotifyNotificationsResponse.data) && Intrinsics.e(this.included, getNotifyNotificationsResponse.included);
    }

    public final List<NotifyNotification> getData() {
        return this.data;
    }

    public final GetNotifyNotificationsIncluded getIncluded() {
        return this.included;
    }

    public final long getMinSyncIntervalSeconds() {
        return this.minSyncIntervalSeconds;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.minSyncIntervalSeconds) * 31;
        List<NotifyNotification> list = this.data;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        GetNotifyNotificationsIncluded getNotifyNotificationsIncluded = this.included;
        return iHashCode2 + (getNotifyNotificationsIncluded != null ? getNotifyNotificationsIncluded.hashCode() : 0);
    }

    public String toString() {
        return "GetNotifyNotificationsResponse(minSyncIntervalSeconds=" + this.minSyncIntervalSeconds + ", data=" + this.data + ", included=" + this.included + ')';
    }

    public /* synthetic */ GetNotifyNotificationsResponse(long j10, List list, GetNotifyNotificationsIncluded getNotifyNotificationsIncluded, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : list, getNotifyNotificationsIncluded);
    }
}
