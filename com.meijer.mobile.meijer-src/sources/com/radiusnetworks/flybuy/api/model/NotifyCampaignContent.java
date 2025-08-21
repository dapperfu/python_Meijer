package com.radiusnetworks.flybuy.api.model;

import com.google.gson.k;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignContent;", "", "Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignNotification;", "notification", "", "deepLinkUrl", "Lcom/google/gson/k;", "metadata", "<init>", "(Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignNotification;Ljava/lang/String;Lcom/google/gson/k;)V", "component1", "()Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignNotification;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/google/gson/k;", "copy", "(Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignNotification;Ljava/lang/String;Lcom/google/gson/k;)Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignContent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/radiusnetworks/flybuy/api/model/NotifyCampaignNotification;", "getNotification", "Ljava/lang/String;", "getDeepLinkUrl", "Lcom/google/gson/k;", "getMetadata", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotifyCampaignContent {

    @InterfaceC16127c(NotificationsManager.INTENT_EXTRA_DEEP_LINK_URL)
    private final String deepLinkUrl;
    private final k metadata;
    private final NotifyCampaignNotification notification;

    public static /* synthetic */ NotifyCampaignContent copy$default(NotifyCampaignContent notifyCampaignContent, NotifyCampaignNotification notifyCampaignNotification, String str, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            notifyCampaignNotification = notifyCampaignContent.notification;
        }
        if ((i10 & 2) != 0) {
            str = notifyCampaignContent.deepLinkUrl;
        }
        if ((i10 & 4) != 0) {
            kVar = notifyCampaignContent.metadata;
        }
        return notifyCampaignContent.copy(notifyCampaignNotification, str, kVar);
    }

    /* renamed from: component1, reason: from getter */
    public final NotifyCampaignNotification getNotification() {
        return this.notification;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final k getMetadata() {
        return this.metadata;
    }

    public final NotifyCampaignContent copy(NotifyCampaignNotification notification, String deepLinkUrl, k metadata) {
        Intrinsics.j(notification, "notification");
        return new NotifyCampaignContent(notification, deepLinkUrl, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyCampaignContent)) {
            return false;
        }
        NotifyCampaignContent notifyCampaignContent = (NotifyCampaignContent) other;
        return Intrinsics.e(this.notification, notifyCampaignContent.notification) && Intrinsics.e(this.deepLinkUrl, notifyCampaignContent.deepLinkUrl) && Intrinsics.e(this.metadata, notifyCampaignContent.metadata);
    }

    public int hashCode() {
        int iHashCode = this.notification.hashCode() * 31;
        String str = this.deepLinkUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.metadata;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public String toString() {
        return "NotifyCampaignContent(notification=" + this.notification + ", deepLinkUrl=" + this.deepLinkUrl + ", metadata=" + this.metadata + ')';
    }

    public NotifyCampaignContent(NotifyCampaignNotification notification, String str, k kVar) {
        Intrinsics.j(notification, "notification");
        this.notification = notification;
        this.deepLinkUrl = str;
        this.metadata = kVar;
    }

    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public final k getMetadata() {
        return this.metadata;
    }

    public final NotifyCampaignNotification getNotification() {
        return this.notification;
    }
}
