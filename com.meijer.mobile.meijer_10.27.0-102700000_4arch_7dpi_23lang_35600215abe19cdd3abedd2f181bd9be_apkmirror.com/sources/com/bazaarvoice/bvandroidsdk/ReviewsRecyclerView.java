package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;

@Deprecated
/* loaded from: classes4.dex */
public final class ReviewsRecyclerView extends ConversationsDisplayRecyclerView<ReviewsRequest, ReviewResponse> {
    public ReviewsRecyclerView(Context context) {
        super(context);
    }

    public ReviewsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    BVEventValues.BVProductType getBVProductType() {
        return BVEventValues.BVProductType.CONVERSATIONS_REVIEWS;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    BVEventValues.BVProductType getBvProductType() {
        return BVEventValues.BVProductType.CONVERSATIONS_REVIEWS;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    String getContainerId() {
        return "ReviewsRecyclerView";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    public String getProductIdFromRequest(ReviewsRequest reviewsRequest) {
        return reviewsRequest.getProductId();
    }

    public ReviewsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
