package com.bazaarvoice.bvandroidsdk;

import android.os.Looper;
import com.bazaarvoice.bvandroidsdk.BVSDK;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes4.dex */
public final class BVConversationsClient {
    private final Looper bgLooper;
    private final BVConfig bvConfig;
    private final ConversationsAnalyticsManager conversationsAnalyticsManager;
    private final Gson gson;
    private final OkHttpClient okHttpClient;
    private final RequestFactory requestFactory;
    private final Looper uiLooper;

    public static class Builder {
        private Looper bgLooper;
        private BVConfig bvConfig;
        private final BVSDK bvsdk;
        private ConversationsAnalyticsManager conversationsAnalyticsManager;
        private FingerprintProvider fingerprintProvider;
        private final Gson gson;
        private final OkHttpClient okHttpClient;
        private RequestFactory requestFactory;
        private Looper uiLooper;

        Builder bgLooper(Looper looper) {
            this.bgLooper = looper;
            return this;
        }

        public BVConversationsClient build() {
            if (this.bvConfig == null) {
                this.bvConfig = this.bvsdk.getBvUserProvidedData().getBvConfig();
            }
            if (this.fingerprintProvider == null) {
                this.fingerprintProvider = FingerprintProvider.EMPTY;
            }
            this.requestFactory = new BasicRequestFactory(this.bvsdk.getBvUserProvidedData().getBvMobileInfo(), this.bvsdk.getBvWorkerData().getRootApiUrls(), this.bvConfig, this.bvsdk.getBvWorkerData().getBvSdkUserAgent(), this.fingerprintProvider);
            this.conversationsAnalyticsManager = new ConversationsAnalyticsManager(this.bvsdk.getBvPixel(), this.bvConfig.getClientId());
            return new BVConversationsClient(this);
        }

        public Builder bvConfig(BVConfig bVConfig) {
            this.bvConfig = bVConfig;
            return this;
        }

        public Builder fingerprintProvider(FingerprintProvider fingerprintProvider) {
            this.fingerprintProvider = fingerprintProvider;
            return this;
        }

        Builder uiLooper(Looper looper) {
            this.uiLooper = looper;
            return this;
        }

        public Builder(BVSDK bvsdk) {
            this.bvsdk = bvsdk;
            BVSDK.BVWorkerData bvWorkerData = bvsdk.getBvWorkerData();
            this.bgLooper = bvWorkerData.getBackgroundLooper();
            this.uiLooper = Looper.getMainLooper();
            this.okHttpClient = bvWorkerData.getOkHttpClient();
            this.gson = bvWorkerData.getGson();
        }
    }

    public interface DisplayLoader<RequestType extends ConversationsDisplayRequest, ResponseType extends ConversationsDisplayResponse> {
        void loadAsync(LoadCallDisplay<RequestType, ResponseType> loadCallDisplay, ConversationsCallback<ResponseType> conversationsCallback);

        void loadAsync(LoadCallDisplay<RequestType, ResponseType> loadCallDisplay, ConversationsDisplayCallback<ResponseType> conversationsDisplayCallback);
    }

    public LoadCallDisplay<QuestionAndAnswerRequest, QuestionAndAnswerResponse> prepareCall(QuestionAndAnswerRequest questionAndAnswerRequest) {
        return factoryCreateDisplayCall(QuestionAndAnswerResponse.class, questionAndAnswerRequest);
    }

    public BVConversationsClient() {
        BVConversationsClient bVConversationsClientBuild = new Builder(BVSDK.getInstance()).build();
        this.bvConfig = bVConversationsClientBuild.bvConfig;
        this.requestFactory = bVConversationsClientBuild.requestFactory;
        this.conversationsAnalyticsManager = bVConversationsClientBuild.conversationsAnalyticsManager;
        this.bgLooper = bVConversationsClientBuild.bgLooper;
        this.uiLooper = bVConversationsClientBuild.uiLooper;
        this.okHttpClient = bVConversationsClientBuild.okHttpClient;
        this.gson = bVConversationsClientBuild.gson;
    }

    private <RequestType extends ConversationsDisplayRequest, ResponseType extends ConversationsDisplayResponse> LoadCallDisplay<RequestType, ResponseType> factoryCreateDisplayCall(Class<ResponseType> cls, RequestType requesttype) {
        return new LoadCallDisplay<>(requesttype, cls, this.okHttpClient.b(this.requestFactory.create(requesttype)), this.conversationsAnalyticsManager, this.okHttpClient, this.gson, this.uiLooper, this.bgLooper);
    }

    private <RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> LoadCallProgressiveSubmission<RequestType, ResponseType> factoryCreateProgressiveSubmissionCall(Class<ResponseType> cls, RequestType requesttype) {
        Request requestCreate = this.requestFactory.create(requesttype);
        ConversationsAnalyticsManager conversationsAnalyticsManager = this.conversationsAnalyticsManager;
        Looper looper = this.uiLooper;
        Looper looper2 = this.bgLooper;
        OkHttpClient okHttpClient = this.okHttpClient;
        return new LoadCallProgressiveSubmission<>(requesttype, cls, conversationsAnalyticsManager, looper, looper2, okHttpClient, this.gson, okHttpClient.b(requestCreate));
    }

    private <RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> LoadCallSubmission<RequestType, ResponseType> loadCallFromSubmission(Class<ResponseType> cls, RequestType requesttype) {
        return new LoadCallSubmission<>(requesttype, cls, this.conversationsAnalyticsManager, this.requestFactory, this.bgLooper, this.uiLooper, this.okHttpClient, this.gson);
    }

    public LoadCallDisplay<ReviewHighlightsRequest, ReviewHighlightsResponse> prepareCall(ReviewHighlightsRequest reviewHighlightsRequest) {
        return factoryCreateDisplayCall(ReviewHighlightsResponse.class, reviewHighlightsRequest);
    }

    private <RequestType extends ConversationsSubmissionRequest, ResponseType extends ConversationsResponse> LoadCallSubmission<RequestType, ResponseType> factoryCreateSubmissionCall(Class<ResponseType> cls, RequestType requesttype) {
        if (requesttype.getAction() == Action.Submit) {
            requesttype.setForcePreview(true);
        }
        return loadCallFromSubmission(cls, requesttype);
    }

    public LoadCallDisplay<ProductDisplayPageRequest, ProductDisplayPageResponse> prepareCall(ProductDisplayPageRequest productDisplayPageRequest) {
        return factoryCreateDisplayCall(ProductDisplayPageResponse.class, productDisplayPageRequest);
    }

    public LoadCallDisplay<BulkProductRequest, BulkProductResponse> prepareCall(BulkProductRequest bulkProductRequest) {
        return factoryCreateDisplayCall(BulkProductResponse.class, bulkProductRequest);
    }

    public LoadCallDisplay<BulkRatingsRequest, BulkRatingsResponse> prepareCall(BulkRatingsRequest bulkRatingsRequest) {
        return factoryCreateDisplayCall(BulkRatingsResponse.class, bulkRatingsRequest);
    }

    public LoadCallDisplay<BulkStoreRequest, BulkStoreResponse> prepareCall(BulkStoreRequest bulkStoreRequest) {
        return factoryCreateDisplayCall(BulkStoreResponse.class, bulkStoreRequest);
    }

    public LoadCallDisplay<ReviewsRequest, ReviewResponse> prepareCall(ReviewsRequest reviewsRequest) {
        return factoryCreateDisplayCall(ReviewResponse.class, reviewsRequest);
    }

    public LoadCallDisplay<FeaturesRequest, FeaturesResponse> prepareCall(FeaturesRequest featuresRequest) {
        return factoryCreateDisplayCall(FeaturesResponse.class, featuresRequest);
    }

    public LoadCallDisplay<ReviewSummaryRequest, ReviewSummaryResponse> prepareCall(ReviewSummaryRequest reviewSummaryRequest) {
        return factoryCreateDisplayCall(ReviewSummaryResponse.class, reviewSummaryRequest);
    }

    public LoadCallDisplay<StoreReviewsRequest, StoreReviewResponse> prepareCall(StoreReviewsRequest storeReviewsRequest) {
        return factoryCreateDisplayCall(StoreReviewResponse.class, storeReviewsRequest);
    }

    private BVConversationsClient(Builder builder) {
        this.bvConfig = builder.bvConfig;
        this.requestFactory = builder.requestFactory;
        this.conversationsAnalyticsManager = builder.conversationsAnalyticsManager;
        this.bgLooper = builder.bgLooper;
        this.uiLooper = builder.uiLooper;
        this.okHttpClient = builder.okHttpClient;
        this.gson = builder.gson;
    }

    public LoadCallDisplay<AuthorsRequest, AuthorsResponse> prepareCall(AuthorsRequest authorsRequest) {
        return factoryCreateDisplayCall(AuthorsResponse.class, authorsRequest);
    }

    public LoadCallDisplay<CommentsRequest, CommentsResponse> prepareCall(CommentsRequest commentsRequest) {
        return factoryCreateDisplayCall(CommentsResponse.class, commentsRequest);
    }

    public LoadCallSubmission<AnswerSubmissionRequest, AnswerSubmissionResponse> prepareCall(AnswerSubmissionRequest answerSubmissionRequest) {
        return factoryCreateSubmissionCall(AnswerSubmissionResponse.class, answerSubmissionRequest);
    }

    public LoadCallSubmission<ReviewSubmissionRequest, ReviewSubmissionResponse> prepareCall(ReviewSubmissionRequest reviewSubmissionRequest) {
        return factoryCreateSubmissionCall(ReviewSubmissionResponse.class, reviewSubmissionRequest);
    }

    public LoadCallSubmission<StoreReviewSubmissionRequest, StoreReviewSubmissionResponse> prepareCall(StoreReviewSubmissionRequest storeReviewSubmissionRequest) {
        return factoryCreateSubmissionCall(StoreReviewSubmissionResponse.class, storeReviewSubmissionRequest);
    }

    public LoadCallSubmission<QuestionSubmissionRequest, QuestionSubmissionResponse> prepareCall(QuestionSubmissionRequest questionSubmissionRequest) {
        return factoryCreateSubmissionCall(QuestionSubmissionResponse.class, questionSubmissionRequest);
    }

    public LoadCallSubmission<FeedbackSubmissionRequest, FeedbackSubmissionResponse> prepareCall(FeedbackSubmissionRequest feedbackSubmissionRequest) {
        return factoryCreateSubmissionCall(FeedbackSubmissionResponse.class, feedbackSubmissionRequest);
    }

    public LoadCallSubmission<CommentSubmissionRequest, CommentSubmissionResponse> prepareCall(CommentSubmissionRequest commentSubmissionRequest) {
        return factoryCreateSubmissionCall(CommentSubmissionResponse.class, commentSubmissionRequest);
    }

    public LoadCallSubmission<UserAuthenticationStringRequest, UserAuthenticationStringResponse> prepareCall(UserAuthenticationStringRequest userAuthenticationStringRequest) {
        return factoryCreateSubmissionCall(UserAuthenticationStringResponse.class, userAuthenticationStringRequest);
    }

    public LoadCallProgressiveSubmission<PhotoUploadRequest, PhotoUploadResponse> prepareCall(PhotoUploadRequest photoUploadRequest) {
        return factoryCreateProgressiveSubmissionCall(PhotoUploadResponse.class, photoUploadRequest);
    }

    public LoadCallProgressiveSubmission<VideoUploadRequest, VideoUploadResponse> prepareCall(VideoUploadRequest videoUploadRequest) {
        return factoryCreateProgressiveSubmissionCall(VideoUploadResponse.class, videoUploadRequest);
    }

    public LoadCallProgressiveSubmission<InitiateSubmitRequest, InitiateSubmitResponse> prepareCall(InitiateSubmitRequest initiateSubmitRequest) {
        return factoryCreateProgressiveSubmissionCall(InitiateSubmitResponse.class, initiateSubmitRequest);
    }

    public LoadCallProgressiveSubmission<ProgressiveSubmitRequest, ProgressiveSubmitResponse> prepareCall(ProgressiveSubmitRequest progressiveSubmitRequest) {
        return factoryCreateProgressiveSubmissionCall(ProgressiveSubmitResponse.class, progressiveSubmitRequest);
    }
}
