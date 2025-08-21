package com.bazaarvoice.bvandroidsdk;

import N6.b;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.IncludedContentBase;
import com.bazaarvoice.bvandroidsdk.ReviewSubmissionRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class ConversationsAnalyticsManager {
    private final BVPixel bvPixel;
    private final String clientId;

    private void sendUgcImpressionEvent(String str, String str2, BVEventValues.BVProductType bVProductType, BVEventValues.BVImpressionContentType bVImpressionContentType, String str3, String str4) {
        this.bvPixel.trackEventForClient(new BVImpressionEvent(str, str2, bVProductType, bVImpressionContentType, str3, str4), this.clientId);
    }

    private void sendUsedFeatureUgcContentSubmission(BVEventValues.BVProductType bVProductType, BVEventValues.BVFeatureUsedEventType bVFeatureUsedEventType, String str, boolean z10) {
        sendUsedFeatureUgcContentSubmission(bVProductType, bVFeatureUsedEventType, str, z10, null, null);
    }

    private BVEventValues.BVFeatureUsedEventType feedbackTypeToFeatureUsedEventType(String str) {
        return (str == null || str.isEmpty() || str.equals(b.HELPFULNESS.b()) || !str.equals(b.INAPPROPRIATE.b())) ? BVEventValues.BVFeatureUsedEventType.FEEDBACK : BVEventValues.BVFeatureUsedEventType.INAPPROPRIATE;
    }

    private void sendFeatureUsedEvent(String str, BVEventValues.BVProductType bVProductType, BVEventValues.BVFeatureUsedEventType bVFeatureUsedEventType) {
        this.bvPixel.track(new BVFeatureUsedEvent(str, bVProductType, bVFeatureUsedEventType, null));
    }

    private void sendPdpProductPageView(List<Product> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Product product = list.get(0);
        sendProductPageView(BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, product.getId(), product);
    }

    private void sendProductPageView(BVEventValues.BVProductType bVProductType, String str, Product product) {
        String categoryId;
        HashMap map = new HashMap();
        if (product != null) {
            categoryId = product.getCategoryId() == null ? "" : product.getCategoryId();
            if (product.getQaStatistics() != null) {
                Integer totalQuestionCount = product.getQaStatistics().getTotalQuestionCount();
                totalQuestionCount.intValue();
                map.put("numQuestions", totalQuestionCount);
            }
            if (product.getQaStatistics() != null) {
                Integer totalAnswerCount = product.getQaStatistics().getTotalAnswerCount();
                totalAnswerCount.intValue();
                map.put("numAnswers", totalAnswerCount);
            }
            if (product.getReviewStatistics() != null) {
                Integer totalReviewCount = product.getReviewStatistics().getTotalReviewCount();
                totalReviewCount.intValue();
                map.put("numReviews", totalReviewCount);
            }
            if (product.getBrand() != null && product.getBrand().get("name") != null) {
                map.put("brand", product.getBrandExternalId());
            }
        } else {
            categoryId = null;
        }
        BVPageViewEvent bVPageViewEvent = new BVPageViewEvent(str, bVProductType, categoryId);
        bVPageViewEvent.setAdditionalParams(map);
        this.bvPixel.trackEventForClient(bVPageViewEvent, this.clientId);
    }

    private void sendQAndAProductPageView(List<Question> list) {
        Question question;
        if (list == null || list.isEmpty() || (question = list.get(0)) == null) {
            return;
        }
        sendProductPageView(BVEventValues.BVProductType.CONVERSATIONS_QANDA, question.getProductId(), question.getProduct());
    }

    private void sendReviewsProductPageView(List<Review> list) {
        Review review;
        if (list == null || list.isEmpty() || (review = list.get(0)) == null) {
            return;
        }
        sendProductPageView(BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, review.getProductId(), review.getProduct());
    }

    private void sendUsedFeatureDisplayAuthor(String str) {
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent("none", BVEventValues.BVProductType.CONVERSATIONS_PROFILE, BVEventValues.BVFeatureUsedEventType.PROFILE, null);
        HashMap map = new HashMap();
        map.put("interaction", Boolean.FALSE);
        map.put("page", str);
        bVFeatureUsedEvent.setAdditionalParams(map);
        this.bvPixel.trackEventForClient(bVFeatureUsedEvent, this.clientId);
    }

    private void sendUsedFeatureEventReviewHighlights(String str) {
        this.bvPixel.trackEventForClient(new BVFeatureUsedEvent(str, BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVFeatureUsedEventType.REVIEWHIGHLIGHTS, null), this.clientId);
    }

    private void sendUsedFeatureUgcContentSubmission(BVEventValues.BVProductType bVProductType, BVEventValues.BVFeatureUsedEventType bVFeatureUsedEventType, String str, boolean z10, String str2, String str3) {
        if (str == null) {
            str = "none";
        }
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(str, bVProductType, bVFeatureUsedEventType, null);
        HashMap map = new HashMap();
        map.put("fingerprinting", Boolean.valueOf(z10));
        if (str2 != null) {
            map.put("contentId", str2);
        }
        if (str3 != null) {
            map.put("contentType", str3);
        }
        bVFeatureUsedEvent.setAdditionalParams(map);
        this.bvPixel.trackEventForClient(bVFeatureUsedEvent, this.clientId);
    }

    private void sendUsedFeatureUgcFeedbackSubmission(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        if (str2 != null) {
            map.put("contentId", str2);
        }
        if (str3 != null) {
            map.put("contentType", str3);
        }
        if (str4 != null) {
            map.put("detail1", str4);
        }
        BVFeatureUsedEvent bVFeatureUsedEvent = new BVFeatureUsedEvent(str, BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, feedbackTypeToFeatureUsedEventType(str4), null);
        bVFeatureUsedEvent.setAdditionalParams(map);
        this.bvPixel.trackEventForClient(bVFeatureUsedEvent, this.clientId);
    }

    void sendSuccessfulConversationsDisplayResponse(ConversationsResponse conversationsResponse, ConversationsDisplayRequest conversationsDisplayRequest) {
        if (conversationsResponse instanceof ReviewResponse) {
            ConversationsDisplayResponse conversationsDisplayResponse = (ReviewResponse) conversationsResponse;
            sendUgcImpressionEvent(conversationsDisplayResponse.getResults(), BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVImpressionContentType.REVIEW);
            sendReviewsProductPageView(conversationsDisplayResponse.getResults());
            return;
        }
        if (conversationsResponse instanceof StoreReviewResponse) {
            sendUgcImpressionEvent(((StoreReviewResponse) conversationsResponse).getResults(), BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVImpressionContentType.STORE_REVIEW);
            return;
        }
        if (conversationsResponse instanceof BulkStoreResponse) {
            sendUgcImpressionEventStores(((BulkStoreResponse) conversationsResponse).getResults());
            return;
        }
        if (conversationsResponse instanceof QuestionAndAnswerResponse) {
            ConversationsDisplayResponse conversationsDisplayResponse2 = (QuestionAndAnswerResponse) conversationsResponse;
            sendUgcImpressionEventQAndA(conversationsDisplayResponse2.getResults());
            sendQAndAProductPageView(conversationsDisplayResponse2.getResults());
        } else {
            if (conversationsResponse instanceof ProductDisplayPageResponse) {
                sendPdpProductPageView(((ProductDisplayPageResponse) conversationsResponse).getResults());
                return;
            }
            if (conversationsResponse instanceof AuthorsResponse) {
                sendUsedFeatureDisplayAuthors((AuthorsResponse) conversationsResponse);
            } else if (conversationsResponse instanceof CommentsResponse) {
                sendUgcImpressionEvent(((CommentsResponse) conversationsResponse).getResults(), BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVImpressionContentType.COMMENT);
            } else if (conversationsResponse instanceof ReviewHighlightsResponse) {
                sendUsedFeatureEventReviewHighlights(((ReviewHighlightsRequest) conversationsDisplayRequest).getProductId());
            }
        }
    }

    void sendSuccessfulConversationsPhotoUpload(ConversationsSubmissionRequest conversationsSubmissionRequest) {
        if (conversationsSubmissionRequest instanceof ReviewSubmissionRequest) {
            this.bvPixel.trackEventForClient(new BVFeatureUsedEvent(((ReviewSubmissionRequest.Builder) ((ReviewSubmissionRequest) conversationsSubmissionRequest).getBuilder()).productId, BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVFeatureUsedEventType.PHOTO, null), this.clientId);
        }
    }

    public void sendUsedFeatureInViewEvent(String str, String str2, BVEventValues.BVProductType bVProductType) {
        if (str == null || str2 == null) {
            return;
        }
        this.bvPixel.trackEventForClient(new BVInViewEvent(str, str2, bVProductType, null), this.clientId);
    }

    public void sendUsedFeatureScrolledEvent(String str, BVEventValues.BVProductType bVProductType) {
        if (str == null) {
            str = "";
        }
        this.bvPixel.trackEventForClient(new BVFeatureUsedEvent(str, bVProductType, BVEventValues.BVFeatureUsedEventType.SCROLLED, null), this.clientId);
    }

    ConversationsAnalyticsManager(BVPixel bVPixel, String str) {
        this.bvPixel = bVPixel;
        this.clientId = str;
    }

    private void sendInitSubmitRequestFeatureUsedEvent(InitiateSubmitRequest initiateSubmitRequest) {
        Iterator<String> it = initiateSubmitRequest.getProductIds().iterator();
        while (it.hasNext()) {
            sendFeatureUsedEvent(it.next(), BVEventValues.BVProductType.PROGRESSIVE_SUBMISSION, BVEventValues.BVFeatureUsedEventType.IN_VIEW);
        }
    }

    private <CgcType extends IncludedContentBase.ProductIncludedContentBase> void sendUgcImpressionEvent(List<CgcType> list, BVEventValues.BVProductType bVProductType, BVEventValues.BVImpressionContentType bVImpressionContentType) {
        String str;
        String id2;
        for (CgcType cgctype : list) {
            if (cgctype != null) {
                String productId = cgctype.getProductId();
                id2 = cgctype.getId();
                str = productId;
            } else {
                str = "";
                id2 = str;
            }
            sendUgcImpressionEvent(str, id2, bVProductType, bVImpressionContentType, null, null);
        }
    }

    private void sendUgcImpressionEventQAndA(List<Question> list) {
        String str;
        String str2;
        String id2;
        for (Question question : list) {
            if (question == null) {
                str = "";
                str2 = str;
            } else {
                String productId = question.getProductId();
                String id3 = question.getId();
                List<Answer> answers = question.getAnswers();
                if (answers != null) {
                    for (Answer answer : answers) {
                        if (answer == null) {
                            id2 = "";
                        } else {
                            id2 = answer.getId();
                        }
                        sendUgcImpressionEvent(productId, id2, BVEventValues.BVProductType.CONVERSATIONS_QANDA, BVEventValues.BVImpressionContentType.ANSWER, null, null);
                    }
                }
                str = productId;
                str2 = id3;
            }
            sendUgcImpressionEvent(str, str2, BVEventValues.BVProductType.CONVERSATIONS_QANDA, BVEventValues.BVImpressionContentType.QUESTION, null, null);
        }
    }

    private void sendUgcImpressionEventStores(List<Store> list) {
        String id2;
        for (Store store : list) {
            if (store != null) {
                id2 = store.getId();
            } else {
                id2 = "";
            }
            sendUgcImpressionEvent(id2, "", BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVImpressionContentType.STORE, null, null);
        }
    }

    private void sendUsedFeatureDisplayAuthors(AuthorsResponse authorsResponse) {
        if (!authorsResponse.getHasErrors().booleanValue()) {
            Iterator it = authorsResponse.getResults().iterator();
            while (it.hasNext()) {
                sendUsedFeatureDisplayAuthor(((Author) it.next()).getId());
            }
        }
    }

    void sendSuccessfulConversationsSubmitResponse(ConversationsSubmissionRequest conversationsSubmissionRequest) {
        boolean z10;
        if (conversationsSubmissionRequest.getFingerPrint() != null && !conversationsSubmissionRequest.getFingerPrint().isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        if (conversationsSubmissionRequest instanceof QuestionSubmissionRequest) {
            sendUsedFeatureUgcContentSubmission(BVEventValues.BVProductType.CONVERSATIONS_QANDA, BVEventValues.BVFeatureUsedEventType.ASK_QUESTION, ((QuestionSubmissionRequest) conversationsSubmissionRequest).getProductId(), z11);
            return;
        }
        if (conversationsSubmissionRequest instanceof AnswerSubmissionRequest) {
            sendUsedFeatureUgcContentSubmission(BVEventValues.BVProductType.CONVERSATIONS_QANDA, BVEventValues.BVFeatureUsedEventType.ANSWER_QUESTION, "none", z11, ((AnswerSubmissionRequest) conversationsSubmissionRequest).getQuestionId(), BVEventValues.BVImpressionContentType.QUESTION.toString());
            return;
        }
        if (conversationsSubmissionRequest instanceof ReviewSubmissionRequest) {
            sendUsedFeatureUgcContentSubmission(BVEventValues.BVProductType.CONVERSATIONS_REVIEWS, BVEventValues.BVFeatureUsedEventType.WRITE_REVIEW, ((ReviewSubmissionRequest) conversationsSubmissionRequest).getProductId(), z11);
        } else if (conversationsSubmissionRequest instanceof FeedbackSubmissionRequest) {
            FeedbackSubmissionRequest feedbackSubmissionRequest = (FeedbackSubmissionRequest) conversationsSubmissionRequest;
            sendUsedFeatureUgcFeedbackSubmission("none", feedbackSubmissionRequest.getContentId(), feedbackSubmissionRequest.getContentType(), feedbackSubmissionRequest.getFeedbackType());
        } else if (conversationsSubmissionRequest instanceof ProgressiveSubmitRequest) {
            sendUsedFeatureUgcContentSubmission(BVEventValues.BVProductType.PROGRESSIVE_SUBMISSION, BVEventValues.BVFeatureUsedEventType.WRITE_REVIEW, ((ProgressiveSubmitRequest) conversationsSubmissionRequest).getProductId(), z11, null, BVEventValues.BVImpressionContentType.REVIEW.toString());
        } else if (conversationsSubmissionRequest instanceof InitiateSubmitRequest) {
            sendInitSubmitRequestFeatureUsedEvent((InitiateSubmitRequest) conversationsSubmissionRequest);
        }
    }
}
