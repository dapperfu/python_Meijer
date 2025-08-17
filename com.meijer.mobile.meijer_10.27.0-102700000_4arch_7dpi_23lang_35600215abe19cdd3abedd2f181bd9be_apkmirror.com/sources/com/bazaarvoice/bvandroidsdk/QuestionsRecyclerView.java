package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.util.AttributeSet;
import com.bazaarvoice.bvandroidsdk.BVEventValues;

@Deprecated
/* loaded from: classes4.dex */
public final class QuestionsRecyclerView extends ConversationsDisplayRecyclerView<QuestionAndAnswerRequest, QuestionAndAnswerResponse> {
    public QuestionsRecyclerView(Context context) {
        super(context);
    }

    public QuestionsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    BVEventValues.BVProductType getBVProductType() {
        return BVEventValues.BVProductType.CONVERSATIONS_QANDA;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    BVEventValues.BVProductType getBvProductType() {
        return BVEventValues.BVProductType.CONVERSATIONS_QANDA;
    }

    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    String getContainerId() {
        return "QuestionsRecyclerView";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bazaarvoice.bvandroidsdk.ConversationsDisplayRecyclerView
    public String getProductIdFromRequest(QuestionAndAnswerRequest questionAndAnswerRequest) {
        return questionAndAnswerRequest.getProductId();
    }

    public QuestionsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
