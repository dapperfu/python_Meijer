package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
class BVRootApiUrls {
    final String bazaarvoiceApiRootUrl;
    final String bazaarvoiceReviewHighlightUrl;
    final String notificationConfigUrl;
    final String shopperMarketingApiRootUrl;

    public String getBazaarvoiceApiRootUrl() {
        return this.bazaarvoiceApiRootUrl;
    }

    public String getBazaarvoiceReviewHighlightApiUrl() {
        return this.bazaarvoiceReviewHighlightUrl;
    }

    public String getNotificationConfigUrl() {
        return this.notificationConfigUrl;
    }

    public String getShopperMarketingApiRootUrl() {
        return this.shopperMarketingApiRootUrl;
    }

    public BVRootApiUrls(String str, String str2, String str3, String str4) {
        this.shopperMarketingApiRootUrl = str;
        this.bazaarvoiceApiRootUrl = str2;
        this.notificationConfigUrl = str3;
        this.bazaarvoiceReviewHighlightUrl = str4;
    }
}
