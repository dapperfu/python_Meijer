package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class ProductStatistics {

    @InterfaceC16127c("NativeReviewStatistics")
    private ReviewStatistics nativeReviewStatistics;

    @InterfaceC16127c("ProductId")
    private String productId;

    @InterfaceC16127c("QAStatistics")
    private QAStatistics qaStatistics;

    @InterfaceC16127c("ReviewStatistics")
    private ReviewStatistics reviewStatistics;

    public ReviewStatistics getNativeReviewStatistics() {
        return this.nativeReviewStatistics;
    }

    public String getProductId() {
        return this.productId;
    }

    public QAStatistics getQAStatistics() {
        return this.qaStatistics;
    }

    public ReviewStatistics getReviewStatistics() {
        return this.reviewStatistics;
    }
}
