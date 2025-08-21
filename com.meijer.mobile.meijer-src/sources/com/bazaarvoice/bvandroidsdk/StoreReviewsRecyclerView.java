package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;

@Deprecated
/* loaded from: classes4.dex */
public class StoreReviewsRecyclerView extends ConversationsDisplayRecyclerView<StoreReviewsRequest, StoreReviewResponse> {
    public StoreReviewsRecyclerView(Context context) {
        super(context);
    }

    public StoreReviewsRecyclerView(Context context, AttributeSet attributeSet) {
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
        return "StoreReviewsRecyclerView";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    public String getProductIdFromRequest(StoreReviewsRequest storeReviewsRequest) {
        return storeReviewsRequest.getStoreId();
    }

    public StoreReviewsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
