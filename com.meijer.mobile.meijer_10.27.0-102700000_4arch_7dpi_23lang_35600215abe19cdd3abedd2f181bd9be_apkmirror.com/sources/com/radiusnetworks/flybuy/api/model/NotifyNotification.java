package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyNotification;", "", "campaignId", "", "siteId", "(ILjava/lang/Integer;)V", "getCampaignId", "()I", "getSiteId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/NotifyNotification;", "equals", "", "other", "hashCode", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyNotification {

    @InterfaceC15617c("campaign_id")
    private final int campaignId;

    @InterfaceC15617c("site_id")
    private final Integer siteId;

    public NotifyNotification(int i10, Integer num) {
        this.campaignId = i10;
        this.siteId = num;
    }

    public static /* synthetic */ NotifyNotification copy$default(NotifyNotification notifyNotification, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = notifyNotification.campaignId;
        }
        if ((i11 & 2) != 0) {
            num = notifyNotification.siteId;
        }
        return notifyNotification.copy(i10, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSiteId() {
        return this.siteId;
    }

    public final NotifyNotification copy(int campaignId, Integer siteId) {
        return new NotifyNotification(campaignId, siteId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyNotification)) {
            return false;
        }
        NotifyNotification notifyNotification = (NotifyNotification) other;
        return this.campaignId == notifyNotification.campaignId && Intrinsics.e(this.siteId, notifyNotification.siteId);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final Integer getSiteId() {
        return this.siteId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.campaignId) * 31;
        Integer num = this.siteId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "NotifyNotification(campaignId=" + this.campaignId + ", siteId=" + this.siteId + ')';
    }
}
