package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
final class StoreNotificationData extends BVNotificationData {

    @InterfaceC15617c("defaultStoreImageUrl")
    private String defaultStoreImageUrl;

    @InterfaceC15617c("requestReviewOnAppOpen")
    private boolean requestReviewOnAppOpen;

    @InterfaceC15617c("visitDuration")
    private int visitDuration;

    public String getDefaultStoreImageUrl() {
        return this.defaultStoreImageUrl;
    }

    public int getVisitDuration() {
        return this.visitDuration;
    }

    public long getVisitDurationMillis() {
        return this.visitDuration * 1000;
    }

    public boolean isRequestReviewOnAppOpen() {
        return this.requestReviewOnAppOpen;
    }

    @Override // com.bazaarvoice.bvandroidsdk.BVNotificationData
    public String toString() {
        return "StoreNotificationData{visitDuration=" + this.visitDuration + ", requestReviewOnAppOpen=" + this.requestReviewOnAppOpen + ", defaultStoreImageUrl='" + this.defaultStoreImageUrl + "', parent='" + super.toString() + "'}";
    }

    StoreNotificationData() {
    }
}
