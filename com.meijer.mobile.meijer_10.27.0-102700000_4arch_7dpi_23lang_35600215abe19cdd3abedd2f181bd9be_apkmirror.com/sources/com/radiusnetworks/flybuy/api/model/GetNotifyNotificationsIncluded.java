package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsIncluded;", "", "campaigns", "", "Lcom/radiusnetworks/flybuy/api/model/NotifyCampaign;", "sites", "Lcom/radiusnetworks/flybuy/api/model/NotifySite;", "(Ljava/util/List;Ljava/util/List;)V", "getCampaigns", "()Ljava/util/List;", "getSites", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetNotifyNotificationsIncluded {
    private final List<NotifyCampaign> campaigns;
    private final List<NotifySite> sites;

    public GetNotifyNotificationsIncluded(List<NotifyCampaign> list, List<NotifySite> list2) {
        this.campaigns = list;
        this.sites = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNotifyNotificationsIncluded copy$default(GetNotifyNotificationsIncluded getNotifyNotificationsIncluded, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getNotifyNotificationsIncluded.campaigns;
        }
        if ((i10 & 2) != 0) {
            list2 = getNotifyNotificationsIncluded.sites;
        }
        return getNotifyNotificationsIncluded.copy(list, list2);
    }

    public final List<NotifyCampaign> component1() {
        return this.campaigns;
    }

    public final List<NotifySite> component2() {
        return this.sites;
    }

    public final GetNotifyNotificationsIncluded copy(List<NotifyCampaign> campaigns, List<NotifySite> sites) {
        return new GetNotifyNotificationsIncluded(campaigns, sites);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNotifyNotificationsIncluded)) {
            return false;
        }
        GetNotifyNotificationsIncluded getNotifyNotificationsIncluded = (GetNotifyNotificationsIncluded) other;
        return Intrinsics.e(this.campaigns, getNotifyNotificationsIncluded.campaigns) && Intrinsics.e(this.sites, getNotifyNotificationsIncluded.sites);
    }

    public final List<NotifyCampaign> getCampaigns() {
        return this.campaigns;
    }

    public final List<NotifySite> getSites() {
        return this.sites;
    }

    public int hashCode() {
        List<NotifyCampaign> list = this.campaigns;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NotifySite> list2 = this.sites;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "GetNotifyNotificationsIncluded(campaigns=" + this.campaigns + ", sites=" + this.sites + ')';
    }
}
