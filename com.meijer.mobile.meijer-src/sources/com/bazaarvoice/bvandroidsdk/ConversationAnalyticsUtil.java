package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.BVEventValues;

/* loaded from: classes4.dex */
final class ConversationAnalyticsUtil {
    static BVEventValues.BVProductType getProductTypeFromRequest(ConversationsRequest conversationsRequest) {
        return ((conversationsRequest instanceof QuestionSubmissionRequest) || (conversationsRequest instanceof QuestionAndAnswerRequest) || (conversationsRequest instanceof AnswerSubmissionRequest)) ? BVEventValues.BVProductType.CONVERSATIONS_QANDA : BVEventValues.BVProductType.CONVERSATIONS_REVIEWS;
    }

    private ConversationAnalyticsUtil() {
    }
}
