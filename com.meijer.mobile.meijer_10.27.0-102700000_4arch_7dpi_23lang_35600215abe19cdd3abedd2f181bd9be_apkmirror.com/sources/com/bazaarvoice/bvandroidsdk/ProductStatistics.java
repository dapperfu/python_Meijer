package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class ProductStatistics {

    @InterfaceC15617c("NativeReviewStatistics")
    private ReviewStatistics nativeReviewStatistics;

    @InterfaceC15617c("ProductId")
    private String productId;

    @InterfaceC15617c("QAStatistics")
    private QAStatistics qaStatistics;

    @InterfaceC15617c("ReviewStatistics")
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
