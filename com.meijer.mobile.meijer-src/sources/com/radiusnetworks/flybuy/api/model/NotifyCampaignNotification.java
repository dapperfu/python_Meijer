package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignNotification;", "", "title", "", "body", "(Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotifyCampaignNotification {
    private final String body;
    private final String title;

    public static /* synthetic */ NotifyCampaignNotification copy$default(NotifyCampaignNotification notifyCampaignNotification, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notifyCampaignNotification.title;
        }
        if ((i10 & 2) != 0) {
            str2 = notifyCampaignNotification.body;
        }
        return notifyCampaignNotification.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final NotifyCampaignNotification copy(String title, String body) {
        return new NotifyCampaignNotification(title, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyCampaignNotification)) {
            return false;
        }
        NotifyCampaignNotification notifyCampaignNotification = (NotifyCampaignNotification) other;
        return Intrinsics.e(this.title, notifyCampaignNotification.title) && Intrinsics.e(this.body, notifyCampaignNotification.body);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NotifyCampaignNotification(title=" + this.title + ", body=" + this.body + ')';
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }

    public NotifyCampaignNotification(String str, String str2) {
        this.title = str;
        this.body = str2;
    }
}
