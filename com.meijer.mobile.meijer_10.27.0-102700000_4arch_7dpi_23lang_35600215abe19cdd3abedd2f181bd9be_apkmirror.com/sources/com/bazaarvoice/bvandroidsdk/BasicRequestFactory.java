package com.bazaarvoice.bvandroidsdk;

import L6.b;
import com.bazaarvoice.bvandroidsdk.BVConfig;
import com.bazaarvoice.bvandroidsdk.BaseReviewSubmissionRequest;
import com.bazaarvoice.bvandroidsdk.ConversationsDisplayRequest;
import com.bazaarvoice.bvandroidsdk.ConversationsSubmissionRequest;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.h;
import okhttp3.j;
import okhttp3.k;

/* loaded from: classes4.dex */
class BasicRequestFactory implements RequestFactory {
    private static final String ANSWER_SUBMIT_ENDPOINT = "data/submitanswer.json";
    private static final String API_VERSION = "5.4";
    private static final String AUTHENTICATE_USER_ENDPOINT = "data/authenticateuser.json";
    private static final String AUTHORS_ENDPOINT = "data/authors.json";
    private static final String COMMENT_SUBMIT_ENDPOINT = "data/submitreviewcomment.json";
    private static final String FEEDBACK_SUBMIT_ENDPOINT = "data/submitfeedback.json";
    private static final String INCLUDE_ANSWERS = "Answers";
    private static final String KEY_ADDITIONAL_PARAM_TEMPLATE = "additionalfield_%s";
    private static final String KEY_AUTH_TOKEN = "authtoken";
    private static final String KEY_CDV_TEMPLATE = "contextdatavalue_%s";
    private static final String KEY_COMMENT_TEXT = "CommentText";
    private static final String KEY_FREEFORM_TAG_TEMPLATE = "tag_%s_%d";
    private static final String KEY_PHOTO_CAPTION_TEMPLATE = "photocaption_%d";
    private static final String KEY_PHOTO_URL_TEMPLATE = "photourl_%d";
    private static final String KEY_RATING_TEMPLATE = "rating_%s";
    private static final String KEY_REVIEW_ID = "ReviewId";
    private static final String KEY_SECONDARY_RATING_TEMPLATE = "SecondaryRating_%s";
    private static final String KEY_STATS = "Stats";
    private static final String KEY_TAG_FILTER_TEMPLATE = "tag_%s";
    private static final String KEY_TITLE = "Title";
    private static final String KEY_USER_AGENT = "User-Agent";
    private static final String KEY_VIDEO_CAPTION_TEMPLATE = "videocaption_%d";
    private static final String KEY_VIDEO_URL_TEMPLATE = "videourl_%d";
    private static final j MEDIA_TYPE_JPG = j.g("image/jpg");
    private static final j MEDIA_TYPE_VIDEO = j.g("video/*");
    private static final String PHOTO_SUBMIT_ENDPOINT = "data/uploadphoto.json";
    private static final String PRODUCTS_ENDPOINT = "data/products.json";
    private static final String QUESTIONS_AND_ANSWERS_ENDPOINT = "data/questions.json";
    private static final String QUESTION_SUBMIT_ENDPOINT = "data/submitquestion.json";
    private static final String REVIEWS_ENDPOINT = "data/reviews.json";
    private static final String REVIEW_COMMENTS_ENDPOINT = "data/reviewcomments.json";
    private static final String REVIEW_HIGHLIGHTS_ENDPOINT = "highlights/v3/1";
    private static final String REVIEW_SUBMIT_ENDPOINT = "data/submitreview.json";
    private static final String REVIEW_SUMMARY_ENDPOINT = "data/reviewsummary";
    private static final String STATS_ENDPOINT = "data/statistics.json";
    private static final String STATS_REVIEWS = "Reviews";
    private static final String TOPIC_FILTER_ENDPOINT = "data/features";
    private static final String VIDEO_CAPTION_TEMPLATE = "VideoCaption_%d";
    private static final String VIDEO_SUBMIT_ENDPOINT = "data/uploadvideo.json";
    private static final String VIDEO_URL_TEMPLATE = "VideoUrl_%d";
    private static final String kACTION = "action";
    private static final String kAGREE_TERMS = "agreedToTermsAndConditions";
    private static final String kANSWERTEXT = "AnswerText";
    private static final String kAPI_VERSION = "apiversion";
    private static final String kAPP_ID = "_appId";
    private static final String kAPP_VERSION = "_appVersion";
    private static final String kBUILD_NUM = "_buildNumber";
    private static final String kCAMPAIGN_ID = "campaignid";
    private static final String kCONTENT_ID = "ContentId";
    private static final String kCONTENT_TYPE = "ContentType";
    public static final String kDEVICE_FINGERPRINT = "deviceFingerprint";
    public static final String kEMAIL_USER = "userEmail";
    private static final String kEMBED = "embed";
    private static final String kFEATURES = "feature";
    private static final String kFEEDBACK_TYPE = "FeedbackType";
    private static final String kFILTER = "Filter";
    private static final String kFILTER_AUTHORS = "Filter_Authors";
    private static final String kFILTER_COMMENTS = "Filter_Comments";
    private static final String kFILTER_QUESTIONS = "Filter_Questions";
    private static final String kFILTER_REVIEW = "Filter_Reviews";
    private static final String kFINGER_PRINT = "fp";
    private static final String kFormatType = "formatType";
    private static final String kHOSTED_AUTH_EMAIL = "hostedauthentication_authenticationemail";
    private static final String kHOST_AUTH_CALLBACK = "hostedauthentication_callbackurl";
    private static final String kINCENTIVIZED_STATS = "incentivizedstats";
    private static final String kINCLUDE = "Include";
    private static final String kIS_ANONUSER = "IsUserAnonymous";
    private static final String kIS_RECOMMENDED = "IsRecommended";
    private static final String kLIMIT = "Limit";
    private static final String kLOCALE = "locale";
    private static final String kLanguage = "language";
    private static final String kNET_PROMOTER_COMMENT = "NetPromoterComment";
    private static final String kNET_PROMOTER_SCORE = "NetPromoterScore";
    private static final String kOFFSET = "Offset";
    private static final String kPASS_KEY = "passkey";
    private static final String kPRODUCT_ID = "ProductId";
    private static final String kProductId = "productId";
    private static final String kQUESTIONID = "QuestionId";
    private static final String kQUESTION_DETAILS = "QuestionDetails";
    private static final String kQUESTION_SUMMARY = "QuestionSummary";
    private static final String kQUOTES = "quotes";
    private static final String kRATING = "Rating";
    private static final String kREASON_TEXT = "ReasonText";
    private static final String kREVIEW_TEXT = "ReviewText";
    private static final String kSDK_VERSION = "_bvAndroidSdkVersion";
    private static final String kSEARCH = "Search";
    private static final String kSECONDARY_RATING_STATS = "secondaryratingstats";
    private static final String kSEND_EMAIL_ANSWERED = "SendEmailAlertWhenAnswered";
    private static final String kSEND_EMAIL_COMMENTED = "SendEmailAlertWhenCommented";
    private static final String kSEND_EMAIL_PUBLISHED = "sendemailalertwhenpublished";
    private static final String kSORT = "Sort";
    private static final String kSORT_ANSWERS = "Sort_Answers";
    private static final String kSORT_QUESTIONS = "Sort_Questions";
    private static final String kSORT_REVIEW = "Sort_Reviews";
    private static final String kSTATS = "Stats";
    private static final String kTAG_STATS = "tagstats";
    private static final String kTITLE = "Title";
    private static final String kUSER = "User";
    private static final String kUSER_EMAIL = "UserEmail";
    private static final String kUSER_ID = "UserId";
    private static final String kUSER_LOCATION = "UserLocation";
    private static final String kUSER_NICKNAME = "UserNickname";
    private static final String kVOTE = "Vote";
    private BVConfig.Builder bvConfigBuilder;
    private final BVMobileInfo bvMobileInfo;
    private final String bvReviewHighlightsUrl;
    private final String bvRootApiUrl;
    private final String bvSdkUserAgent;
    private final String convApiKey;
    private final FingerprintProvider fingerprintProvider;
    private final String progressiveSubmissionApiKey;
    private final String storeApiKey;
    private final String kSITENAME = "siteName";
    private final String kUSERTOKEN = "userToken";
    private final String PROGRESSIVE_SUBMIT_ENDPOINT = "data/progressiveSubmit.json";
    private final String PROGRESSIVE_INITIATE_ENDPOINT = "data/initiateSubmit.json";
    private final String kPRODUCT_IDS = "productIds";
    private final String kSUBMISSION_FIELDS = "submissionFields";
    private final String kSUBMISSION_SESSION_TOKEN = "submissionSessionToken";
    private final String kEXTENDED = "extended";
    private final String kHOSTED_AUTH = "hostedauth";
    private final String kPROGRESSIVE_SUBMISSION_AGREE_TERMS = "agreedtotermsandconditions";

    private String addAdditionalQueryParam(String str, String str2) {
        return String.format("%s:%s", String.format(Locale.US, KEY_ADDITIONAL_PARAM_TEMPLATE, str), str2);
    }

    private static void addCommonHeaders(Headers.a aVar, String str) {
        aVar.a("User-Agent", str);
    }

    private static void addCommonPagingQueryParams(HttpUrl.a aVar, int i10, int i11) {
        aVar.f(kLIMIT, String.valueOf(i10));
        aVar.f(kOFFSET, String.valueOf(i11));
    }

    private void addCommonProgressiveSubmissionJsonParams(m mVar, ConversationsSubmissionRequest conversationsSubmissionRequest, String str, BVMobileInfo bVMobileInfo, FingerprintProvider fingerprintProvider) {
        jsonPutSafe(mVar, kAPI_VERSION, API_VERSION);
        jsonPutSafe(mVar, kPASS_KEY, str);
        jsonPutSafe(mVar, kAPP_ID, bVMobileInfo.getMobileAppIdentifier());
        jsonPutSafe(mVar, kAPP_VERSION, bVMobileInfo.getMobileAppVersion());
        jsonPutSafe(mVar, kBUILD_NUM, bVMobileInfo.getMobileAppCode());
        jsonPutSafe(mVar, kSDK_VERSION, bVMobileInfo.getBvSdkVersion());
        jsonPutSafe(mVar, kCAMPAIGN_ID, conversationsSubmissionRequest.getCampaignId());
        jsonPutSafe(mVar, kDEVICE_FINGERPRINT, fingerprintProvider.getFingerprint());
        jsonPutSafe(mVar, kEMAIL_USER, conversationsSubmissionRequest.getUserEmail());
        if (conversationsSubmissionRequest.getAuthenticationProvider() != null) {
            AuthenticationProvider authenticationProvider = conversationsSubmissionRequest.getAuthenticationProvider();
            if (authenticationProvider instanceof BVHostedAuthenticationProvider) {
                BVHostedAuthenticationProvider bVHostedAuthenticationProvider = (BVHostedAuthenticationProvider) authenticationProvider;
                jsonPutSafe(mVar, kHOSTED_AUTH_EMAIL, bVHostedAuthenticationProvider.getUserEmailAddress());
                jsonPutSafe(mVar, kHOST_AUTH_CALLBACK, bVHostedAuthenticationProvider.getCallbackUrl());
                jsonPutSafe(mVar, "userToken", bVHostedAuthenticationProvider.getUas());
            } else if (authenticationProvider instanceof SiteAuthenticationProvider) {
                jsonPutSafe(mVar, "userToken", ((SiteAuthenticationProvider) authenticationProvider).getUas());
            }
        } else {
            jsonPutSafe(mVar, kEMAIL_USER, conversationsSubmissionRequest.getHostedAuthenticationEmail());
            jsonPutSafe(mVar, kHOST_AUTH_CALLBACK, conversationsSubmissionRequest.getHostedAuthenticationCallback());
            jsonPutSafe(mVar, kUSER.toLowerCase(), conversationsSubmissionRequest.getUser());
        }
        jsonPutSafe(mVar, kLOCALE, conversationsSubmissionRequest.getLocale());
        jsonPutSafe(mVar, kUSER_EMAIL, conversationsSubmissionRequest.getUserEmail());
        jsonPutSafe(mVar, "userId", conversationsSubmissionRequest.getUserId());
        jsonPutSafe(mVar, kUSER_LOCATION, conversationsSubmissionRequest.getUserLocation());
        jsonPutSafe(mVar, kUSER_NICKNAME, conversationsSubmissionRequest.getUserNickname());
        jsonPutSafe(mVar, kSEND_EMAIL_PUBLISHED, conversationsSubmissionRequest.getSendEmailAlertWhenPublished());
        jsonPutSafe(mVar, kAGREE_TERMS, conversationsSubmissionRequest.getAgreedToTermsAndConditions());
        jsonPutSafe(mVar, kACTION, getAction(conversationsSubmissionRequest).getKey());
        for (ConversationsSubmissionRequest.FormPair formPair : conversationsSubmissionRequest.getFormPairs()) {
            jsonPutSafe(mVar, formPair.getKey(), formPair.getValue());
        }
    }

    private static void addCommonQueryParams(HttpUrl.a aVar, String str, BVMobileInfo bVMobileInfo) {
        aVar.f(kAPI_VERSION, API_VERSION).f(kPASS_KEY, str).f(kAPP_ID, bVMobileInfo.getMobileAppIdentifier()).f(kAPP_VERSION, bVMobileInfo.getMobileAppVersion()).f(kBUILD_NUM, bVMobileInfo.getMobileAppCode()).f(kSDK_VERSION, bVMobileInfo.getBvSdkVersion());
    }

    private static void addCommonReviewSubmissionFormParams(h.a aVar, BaseReviewSubmissionRequest baseReviewSubmissionRequest) {
        formPutSafe(aVar, kPRODUCT_ID, baseReviewSubmissionRequest.getProductId());
        formPutSafe(aVar, kIS_RECOMMENDED, baseReviewSubmissionRequest.getRecommended());
        formPutSafe(aVar, kSEND_EMAIL_COMMENTED, baseReviewSubmissionRequest.getSendEmailAlertWhenCommented());
        formPutSafe(aVar, kRATING, Integer.valueOf(baseReviewSubmissionRequest.getRating()));
        formPutSafe(aVar, kNET_PROMOTER_SCORE, baseReviewSubmissionRequest.getNetPromoterScore());
        formPutSafe(aVar, kNET_PROMOTER_COMMENT, baseReviewSubmissionRequest.getNetPromoterComment());
        formPutSafe(aVar, "Title", baseReviewSubmissionRequest.getTitle());
        formPutSafe(aVar, kREVIEW_TEXT, baseReviewSubmissionRequest.getReviewText());
        List<BaseReviewSubmissionRequest.PredefinedTag> predefinedTags = baseReviewSubmissionRequest.getPredefinedTags();
        int i10 = 0;
        for (int i11 = 0; i11 < predefinedTags.size(); i11++) {
            BaseReviewSubmissionRequest.PredefinedTag predefinedTag = predefinedTags.get(i11);
            formPutSafe(aVar, String.format(Locale.US, "tagid_%s/%s", predefinedTag.getQuestionId(), predefinedTag.getTagId()), predefinedTag.getValue());
        }
        Map<String, String> freeFormTags = baseReviewSubmissionRequest.getFreeFormTags();
        ArrayList arrayList = new ArrayList(freeFormTags.keySet());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            String str = (String) arrayList.get(i12);
            formPutSafe(aVar, String.format(Locale.US, KEY_FREEFORM_TAG_TEMPLATE, str, Integer.valueOf(i12)), freeFormTags.get(str));
        }
        for (String str2 : baseReviewSubmissionRequest.getRatingSliders().keySet()) {
            formPutSafe(aVar, String.format(Locale.US, KEY_RATING_TEMPLATE, str2), baseReviewSubmissionRequest.getRatingSliders().get(str2));
        }
        for (String str3 : baseReviewSubmissionRequest.getRatingQuestions().keySet()) {
            formPutSafe(aVar, String.format(Locale.US, KEY_RATING_TEMPLATE, str3), baseReviewSubmissionRequest.getRatingQuestions().get(str3));
        }
        for (String str4 : baseReviewSubmissionRequest.getContextDataValues().keySet()) {
            formPutSafe(aVar, String.format(Locale.US, KEY_CDV_TEMPLATE, str4), baseReviewSubmissionRequest.getContextDataValues().get(str4));
        }
        Map<String, String> additionalFields = baseReviewSubmissionRequest.getAdditionalFields();
        for (String str5 : additionalFields.keySet()) {
            formPutSafe(aVar, String.format(Locale.US, KEY_ADDITIONAL_PARAM_TEMPLATE, str5), additionalFields.get(str5));
        }
        List<VideoSubmissionData> videoSubmissionData = baseReviewSubmissionRequest.getVideoSubmissionData();
        while (i10 < videoSubmissionData.size()) {
            VideoSubmissionData videoSubmissionData2 = videoSubmissionData.get(i10);
            i10++;
            Locale locale = Locale.US;
            formPutSafe(aVar, String.format(locale, VIDEO_URL_TEMPLATE, Integer.valueOf(i10)), videoSubmissionData2.getVideoUrl());
            if (videoSubmissionData2.getVideoCaption() != null) {
                formPutSafe(aVar, String.format(locale, VIDEO_CAPTION_TEMPLATE, Integer.valueOf(i10)), videoSubmissionData2.getVideoCaption());
            }
        }
    }

    private static void addCommonSubmissionFormParams(h.a aVar, ConversationsSubmissionRequest conversationsSubmissionRequest, String str, BVMobileInfo bVMobileInfo, FingerprintProvider fingerprintProvider) {
        formPutSafe(aVar, kAPI_VERSION, API_VERSION);
        formPutSafe(aVar, kPASS_KEY, str);
        formPutSafe(aVar, kAPP_ID, bVMobileInfo.getMobileAppIdentifier());
        formPutSafe(aVar, kAPP_VERSION, bVMobileInfo.getMobileAppVersion());
        formPutSafe(aVar, kBUILD_NUM, bVMobileInfo.getMobileAppCode());
        formPutSafe(aVar, kSDK_VERSION, bVMobileInfo.getBvSdkVersion());
        formPutSafe(aVar, kCAMPAIGN_ID, conversationsSubmissionRequest.getCampaignId());
        formPutSafe(aVar, kFINGER_PRINT, fingerprintProvider.getFingerprint());
        if (conversationsSubmissionRequest.getAuthenticationProvider() != null) {
            AuthenticationProvider authenticationProvider = conversationsSubmissionRequest.getAuthenticationProvider();
            if (authenticationProvider instanceof BVHostedAuthenticationProvider) {
                BVHostedAuthenticationProvider bVHostedAuthenticationProvider = (BVHostedAuthenticationProvider) authenticationProvider;
                formPutSafe(aVar, kHOSTED_AUTH_EMAIL, bVHostedAuthenticationProvider.getUserEmailAddress());
                formPutSafe(aVar, kHOST_AUTH_CALLBACK, bVHostedAuthenticationProvider.getCallbackUrl());
                formPutSafe(aVar, kUSER, bVHostedAuthenticationProvider.getUas());
            } else if (authenticationProvider instanceof SiteAuthenticationProvider) {
                formPutSafe(aVar, kUSER, ((SiteAuthenticationProvider) authenticationProvider).getUas());
            }
        } else {
            formPutSafe(aVar, kHOSTED_AUTH_EMAIL, conversationsSubmissionRequest.getHostedAuthenticationEmail());
            formPutSafe(aVar, kHOST_AUTH_CALLBACK, conversationsSubmissionRequest.getHostedAuthenticationCallback());
            formPutSafe(aVar, kUSER, conversationsSubmissionRequest.getUser());
        }
        formPutSafe(aVar, kLOCALE, conversationsSubmissionRequest.getLocale());
        formPutSafe(aVar, kUSER_EMAIL, conversationsSubmissionRequest.getUserEmail());
        formPutSafe(aVar, kUSER_ID, conversationsSubmissionRequest.getUserId());
        formPutSafe(aVar, kUSER_LOCATION, conversationsSubmissionRequest.getUserLocation());
        formPutSafe(aVar, kUSER_NICKNAME, conversationsSubmissionRequest.getUserNickname());
        formPutSafe(aVar, kSEND_EMAIL_PUBLISHED, conversationsSubmissionRequest.getSendEmailAlertWhenPublished());
        formPutSafe(aVar, kAGREE_TERMS, conversationsSubmissionRequest.getAgreedToTermsAndConditions());
        formPutSafe(aVar, kACTION, getAction(conversationsSubmissionRequest).getKey());
        for (ConversationsSubmissionRequest.FormPair formPair : conversationsSubmissionRequest.getFormPairs()) {
            formPutSafe(aVar, formPair.getKey(), formPair.getValue());
        }
        addSubmissionPhotosFormParams(aVar, conversationsSubmissionRequest);
        addSubmissionVideosFormParams(aVar, conversationsSubmissionRequest);
    }

    private String addSecondaryRatingsQueryParam(String str, EqualityOperator equalityOperator, String str2) {
        return String.format("%s:%s:%s", String.format(Locale.US, KEY_SECONDARY_RATING_TEMPLATE, str), equalityOperator, str2);
    }

    private String addTagQueryParam(String str, String str2) {
        return String.format("%s:%s", String.format(Locale.US, KEY_TAG_FILTER_TEMPLATE, str), str2);
    }

    private Request createFromAnswerSubmissionRequest(AnswerSubmissionRequest answerSubmissionRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(ANSWER_SUBMIT_ENDPOINT);
        h.a aVar2 = new h.a();
        addCommonSubmissionFormParams(aVar2, answerSubmissionRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        formPutSafe(aVar2, kQUESTIONID, answerSubmissionRequest.getQuestionId());
        formPutSafe(aVar2, kANSWERTEXT, answerSubmissionRequest.getAnswerText());
        h hVarC = aVar2.c();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromAuthorsRequest(AuthorsRequest authorsRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(AUTHORS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, authorsRequest);
        if (!authorsRequest.getReviewSorts().isEmpty()) {
            aVarD.f(kSORT_REVIEW, StringUtils.componentsSeparatedBy(authorsRequest.getReviewSorts(), ","));
        }
        if (!authorsRequest.getQuestionSorts().isEmpty()) {
            aVarD.f(kSORT_QUESTIONS, StringUtils.componentsSeparatedBy(authorsRequest.getQuestionSorts(), ","));
        }
        if (!authorsRequest.getAnswerSorts().isEmpty()) {
            aVarD.f(kSORT_ANSWERS, StringUtils.componentsSeparatedBy(authorsRequest.getAnswerSorts(), ","));
        }
        if (!authorsRequest.getIncludes().isEmpty()) {
            aVarD.f(kINCLUDE, StringUtils.componentsSeparatedBy(authorsRequest.getIncludes(), ","));
        }
        for (Include include : authorsRequest.getIncludes()) {
            aVarD.f(include.getLimitParamKey(), String.valueOf(include.getLimit()));
        }
        if (!authorsRequest.getStatistics().isEmpty()) {
            aVarD.f("Stats", StringUtils.componentsSeparatedBy(authorsRequest.getStatistics(), ","));
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromBulkProductRequest(BulkProductRequest bulkProductRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(PRODUCTS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, bulkProductRequest);
        addSortableProductParams(aVarD, bulkProductRequest);
        if (bulkProductRequest.getIncentivizedStats().booleanValue()) {
            aVarD.f(kINCENTIVIZED_STATS, bulkProductRequest.getIncentivizedStats().toString());
        }
        if (bulkProductRequest.getTagStats().booleanValue()) {
            aVarD.f(kTAG_STATS, bulkProductRequest.getTagStats().toString());
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromBulkRatingsRequest(BulkRatingsRequest bulkRatingsRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(STATS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, bulkRatingsRequest);
        aVarD.f("Stats", bulkRatingsRequest.getStatsType().getKey());
        if (bulkRatingsRequest.getIncentivizedStats().booleanValue()) {
            aVarD.f(kINCENTIVIZED_STATS, bulkRatingsRequest.getIncentivizedStats().toString());
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromBulkStoreRequest(BulkStoreRequest bulkStoreRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(PRODUCTS_ENDPOINT);
        addCommonQueryParams(aVarD, this.storeApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, bulkStoreRequest);
        addCommonPagingQueryParams(aVarD, bulkStoreRequest.getLimit(), bulkStoreRequest.getOffset());
        aVarD.f("Stats", bulkStoreRequest.getStatsType().getKey());
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromCommentSubmissionRequest(CommentSubmissionRequest commentSubmissionRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(COMMENT_SUBMIT_ENDPOINT);
        h.a aVar2 = new h.a();
        addCommonSubmissionFormParams(aVar2, commentSubmissionRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        formPutSafe(aVar2, KEY_REVIEW_ID, commentSubmissionRequest.getReviewId());
        formPutSafe(aVar2, KEY_COMMENT_TEXT, commentSubmissionRequest.getCommentText());
        formPutSafe(aVar2, "Title", commentSubmissionRequest.getTitle());
        h hVarC = aVar2.c();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromCommentsRequest(CommentsRequest commentsRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(REVIEW_COMMENTS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, commentsRequest);
        addCommonPagingQueryParams(aVarD, commentsRequest.getLimit(), commentsRequest.getOffset());
        if (!commentsRequest.getIncludeTypes().isEmpty()) {
            aVarD.f(kINCLUDE, StringUtils.componentsSeparatedBy(commentsRequest.getIncludeTypes(), ","));
        }
        if (!commentsRequest.getIncludeTypeLimitMap().isEmpty()) {
            for (CommentIncludeType commentIncludeType : commentsRequest.getIncludeTypeLimitMap().keySet()) {
                aVarD.b(String.format("Limit_%s", commentIncludeType.toString()), String.valueOf(commentsRequest.getIncludeTypeLimitMap().get(commentIncludeType).intValue()));
            }
        }
        if (!commentsRequest.getSorts().isEmpty()) {
            aVarD.f(kSORT, StringUtils.componentsSeparatedBy(commentsRequest.getSorts(), ","));
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromFeaturesRequest(FeaturesRequest featuresRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(TOPIC_FILTER_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        aVarD.f(kProductId, String.valueOf(featuresRequest.getProductId()));
        if (featuresRequest.getLanguage() != null) {
            aVarD.f(kLanguage, String.valueOf(featuresRequest.getLanguage()));
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromFeedbackSubmissionRequest(FeedbackSubmissionRequest feedbackSubmissionRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(FEEDBACK_SUBMIT_ENDPOINT);
        h.a aVar2 = new h.a();
        addCommonSubmissionFormParams(aVar2, feedbackSubmissionRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        formPutSafe(aVar2, kCONTENT_ID, feedbackSubmissionRequest.getContentId());
        formPutSafe(aVar2, kCONTENT_TYPE, feedbackSubmissionRequest.getContentType());
        formPutSafe(aVar2, kFEEDBACK_TYPE, feedbackSubmissionRequest.getFeedbackType());
        formPutSafe(aVar2, kVOTE, feedbackSubmissionRequest.getFeedbackVote());
        formPutSafe(aVar2, kREASON_TEXT, feedbackSubmissionRequest.getReasonFlaggedText());
        h hVarC = aVar2.c();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromInitiateSubmitRequest(InitiateSubmitRequest initiateSubmitRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d("data/initiateSubmit.json");
        j jVarG = j.g("application/json; charset=utf-8");
        m mVar = new m();
        com.google.gson.h hVar = new com.google.gson.h();
        Iterator<String> it = initiateSubmitRequest.getProductIds().iterator();
        while (it.hasNext()) {
            hVar.p(it.next());
        }
        mVar.o("productIds", hVar);
        Headers.a aVar2 = new Headers.a();
        addCommonProgressiveSubmissionJsonParams(mVar, initiateSubmitRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        addCommonQueryParams(aVarD, this.progressiveSubmissionApiKey, this.bvMobileInfo);
        if (initiateSubmitRequest.isExtended()) {
            aVarD.f("extended", "true");
        }
        if (initiateSubmitRequest.isHostedAuth()) {
            aVarD.f("hostedauth", "true");
        }
        aVar2.a("Content-Type", "application/json");
        Headers headersF = aVar2.f();
        HttpUrl httpUrlG = aVarD.g();
        return aVar.v(httpUrlG).n(headersF).p(RequestBody.create(jVarG, mVar.toString())).b();
    }

    private Request createFromPhotoUploadRequest(PhotoUploadRequest photoUploadRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(PHOTO_SUBMIT_ENDPOINT);
        k.a aVar2 = new k.a();
        PhotoUpload photoUpload = photoUploadRequest.getPhotoUpload();
        aVar2.f(k.f154406k).a(kAPI_VERSION, API_VERSION).a(kPASS_KEY, this.convApiKey).a("contenttype", photoUpload.getContentType().getKey()).b("photo", "photo.jpg", RequestBody.create(MEDIA_TYPE_JPG, photoUpload.getPhotoFile()));
        k kVarE = aVar2.e();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(kVarE).b();
    }

    private Request createFromProductDisplayPageRequest(ProductDisplayPageRequest productDisplayPageRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(PRODUCTS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, productDisplayPageRequest);
        addSortableProductParams(aVarD, productDisplayPageRequest);
        addFilertableProductParams(aVarD, productDisplayPageRequest);
        if (productDisplayPageRequest.getIncentivizedStats().booleanValue()) {
            aVarD.f(kINCENTIVIZED_STATS, productDisplayPageRequest.getIncentivizedStats().toString());
        }
        if (productDisplayPageRequest.getSecondaryratingStats().booleanValue()) {
            aVarD.f(kSECONDARY_RATING_STATS, productDisplayPageRequest.getSecondaryratingStats().toString());
        }
        if (productDisplayPageRequest.getTagStats().booleanValue()) {
            aVarD.f(kTAG_STATS, productDisplayPageRequest.getTagStats().toString());
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromProgressiveSubmitRequest(ProgressiveSubmitRequest progressiveSubmitRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d("data/progressiveSubmit.json");
        if (progressiveSubmitRequest.isPreview()) {
            aVarD.f("preview", "true");
        }
        if (progressiveSubmitRequest.isHostedAuth()) {
            aVarD.f("hostedauth", "true");
        }
        if (progressiveSubmitRequest.includeFields()) {
            aVarD.b("fields", "true");
        }
        j jVarG = j.g("application/json; charset=utf-8");
        m mVar = new m();
        Map<String, Object> submissionFields = progressiveSubmitRequest.getSubmissionFields();
        if (!submissionFields.containsKey("agreedtotermsandconditions")) {
            b.h(submissionFields, "agreedtotermsandconditions", progressiveSubmitRequest.getAgreedToTermsAndConditions());
        }
        m mVar2 = new m();
        for (String str : progressiveSubmitRequest.getSubmissionFields().keySet()) {
            Object obj = submissionFields.get(str);
            if (obj != null) {
                mVar2.r(str, obj.toString());
            }
        }
        if (progressiveSubmitRequest.getSubmissionSessionToken() != null && !progressiveSubmitRequest.getSubmissionSessionToken().isEmpty()) {
            mVar.r("submissionSessionToken", progressiveSubmitRequest.getSubmissionSessionToken());
        }
        mVar.o("submissionFields", mVar2);
        mVar.r(kPRODUCT_ID, progressiveSubmitRequest.getProductId());
        mVar.r(kLOCALE, progressiveSubmitRequest.getLocale());
        Headers.a aVar2 = new Headers.a();
        addCommonProgressiveSubmissionJsonParams(mVar, progressiveSubmitRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        addCommonQueryParams(aVarD, this.progressiveSubmissionApiKey, this.bvMobileInfo);
        Headers headersF = aVar2.f();
        HttpUrl httpUrlG = aVarD.g();
        return aVar.v(httpUrlG).n(headersF).p(RequestBody.create(jVarG, mVar.toString())).b();
    }

    private Request createFromQuestionAndAnswerRequest(QuestionAndAnswerRequest questionAndAnswerRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(QUESTIONS_AND_ANSWERS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, questionAndAnswerRequest);
        addCommonPagingQueryParams(aVarD, questionAndAnswerRequest.getLimit(), questionAndAnswerRequest.getOffset());
        aVarD.f(kINCLUDE, INCLUDE_ANSWERS);
        if (!questionAndAnswerRequest.getQuestionSorts().isEmpty()) {
            aVarD.f(kSORT, StringUtils.componentsSeparatedBy(questionAndAnswerRequest.getQuestionSorts(), ","));
        }
        if (!questionAndAnswerRequest.getAnswerSorts().isEmpty()) {
            aVarD.f(kSORT_ANSWERS, StringUtils.componentsSeparatedBy(questionAndAnswerRequest.getAnswerSorts(), ","));
        }
        if (questionAndAnswerRequest.getSearchPhrase() != null) {
            aVarD.f(kSEARCH, questionAndAnswerRequest.getSearchPhrase());
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromQuestionSubmissionRequest(QuestionSubmissionRequest questionSubmissionRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(QUESTION_SUBMIT_ENDPOINT);
        h.a aVar2 = new h.a();
        addCommonSubmissionFormParams(aVar2, questionSubmissionRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        formPutSafe(aVar2, kPRODUCT_ID, questionSubmissionRequest.getProductId());
        formPutSafe(aVar2, kQUESTION_SUMMARY, questionSubmissionRequest.getQuestionSummary());
        formPutSafe(aVar2, kQUESTION_DETAILS, questionSubmissionRequest.getQuestionDetails());
        formPutSafe(aVar2, kIS_ANONUSER, questionSubmissionRequest.getUserAnonymous());
        formPutSafe(aVar2, kSEND_EMAIL_ANSWERED, questionSubmissionRequest.getSendEmailAlertWhenAnswered());
        h hVarC = aVar2.c();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromReivewSummaryRequest(ReviewSummaryRequest reviewSummaryRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(REVIEW_SUMMARY_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        aVarD.f(kProductId, String.valueOf(reviewSummaryRequest.getProductId()));
        if (reviewSummaryRequest.getFormatType() != null) {
            aVarD.f(kFormatType, String.valueOf(reviewSummaryRequest.getFormatType()));
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromReviewHighlightsRequest(ReviewHighlightsRequest reviewHighlightsRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvReviewHighlightsUrl).k().d(REVIEW_HIGHLIGHTS_ENDPOINT);
        aVarD.c(BVSDK.getInstance().getBvUserProvidedData().getBvConfig().getClientId());
        aVarD.c(reviewHighlightsRequest.getProductId());
        return aVar.v(aVarD.g()).b();
    }

    private Request createFromReviewRequest(ReviewsRequest reviewsRequest) {
        String str;
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(REVIEWS_ENDPOINT);
        addCommonQueryParams(aVarD, this.convApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, reviewsRequest);
        addCommonPagingQueryParams(aVarD, reviewsRequest.getLimit(), reviewsRequest.getOffset());
        str = "";
        if (!reviewsRequest.getReviewIncludeTypes().isEmpty()) {
            str = reviewsRequest.getReviewIncludeTypes().contains(ReviewIncludeType.PRODUCTS) ? "Reviews," : "";
            aVarD.f(kINCLUDE, StringUtils.componentsSeparatedBy(reviewsRequest.getReviewIncludeTypes(), ","));
        }
        if (reviewsRequest.getIncentivizedStats().booleanValue()) {
            aVarD.f(kINCENTIVIZED_STATS, reviewsRequest.getIncentivizedStats().toString());
        }
        if (reviewsRequest.getSecondaryratingstats().booleanValue()) {
            aVarD.f(kSECONDARY_RATING_STATS, reviewsRequest.getSecondaryratingstats().toString());
        }
        if (reviewsRequest.getTagStats().booleanValue()) {
            aVarD.f(kTAG_STATS, reviewsRequest.getTagStats().toString());
        }
        if (reviewsRequest.getFeatures() != null) {
            aVarD.f(kFEATURES, reviewsRequest.getFeatures());
        }
        if (!reviewsRequest.getSorts().isEmpty()) {
            aVarD.f(kSORT, StringUtils.componentsSeparatedBy(reviewsRequest.getSorts(), ","));
        }
        if (!reviewsRequest.getRelevancySorts().isEmpty()) {
            aVarD.f(kSORT, StringUtils.componentsSeparatedBy(reviewsRequest.getRelevancySorts(), ","));
        }
        if (reviewsRequest.getSearchPhrase() != null) {
            aVarD.f(kSEARCH, reviewsRequest.getSearchPhrase());
        }
        if (!reviewsRequest.getStatistics().isEmpty()) {
            str = str + StringUtils.componentsSeparatedBy(reviewsRequest.getStatistics(), ",");
        }
        if (!str.isEmpty()) {
            aVarD.f("Stats", str);
        }
        if (reviewsRequest.getContextDataValues() != null) {
            for (String str2 : reviewsRequest.getContextDataValues().keySet()) {
                aVarD.b(kFILTER, getContextDataValue(str2, reviewsRequest.getContextDataValues().get(str2)));
            }
        }
        if (reviewsRequest.getAdditionalFields() != null) {
            for (String str3 : reviewsRequest.getAdditionalFields().keySet()) {
                aVarD.b(kFILTER, addAdditionalQueryParam(str3, reviewsRequest.getAdditionalFields().get(str3)));
            }
        }
        if (reviewsRequest.getSecondaryRatings() != null) {
            for (BVSecondaryRatingFilter bVSecondaryRatingFilter : reviewsRequest.getSecondaryRatings()) {
                aVarD.b(kFILTER, addSecondaryRatingsQueryParam(bVSecondaryRatingFilter.getType(), bVSecondaryRatingFilter.getEqualityOperator(), bVSecondaryRatingFilter.getValue()));
            }
        }
        if (reviewsRequest.getTagFilters() != null) {
            for (String str4 : reviewsRequest.getTagFilters().keySet()) {
                aVarD.b(kFILTER, addTagQueryParam(str4, reviewsRequest.getTagFilters().get(str4)));
            }
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromReviewSubmissionRequest(ReviewSubmissionRequest reviewSubmissionRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(REVIEW_SUBMIT_ENDPOINT);
        h.a aVar2 = new h.a();
        addCommonSubmissionFormParams(aVar2, reviewSubmissionRequest, this.convApiKey, this.bvMobileInfo, this.fingerprintProvider);
        addCommonReviewSubmissionFormParams(aVar2, reviewSubmissionRequest);
        h hVarC = aVar2.c();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromStoreReviewSubmissionRequest(StoreReviewSubmissionRequest storeReviewSubmissionRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(REVIEW_SUBMIT_ENDPOINT);
        h.a aVar2 = new h.a();
        addCommonSubmissionFormParams(aVar2, storeReviewSubmissionRequest, this.storeApiKey, this.bvMobileInfo, this.fingerprintProvider);
        addCommonReviewSubmissionFormParams(aVar2, storeReviewSubmissionRequest);
        h hVarC = aVar2.c();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromStoreReviewsRequest(StoreReviewsRequest storeReviewsRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(REVIEWS_ENDPOINT);
        addCommonQueryParams(aVarD, this.storeApiKey, this.bvMobileInfo);
        addCommonDisplayQueryParams(aVarD, storeReviewsRequest);
        addCommonPagingQueryParams(aVarD, storeReviewsRequest.getLimit(), storeReviewsRequest.getOffset());
        if (!storeReviewsRequest.getReviewIncludeTypes().isEmpty()) {
            if (storeReviewsRequest.getReviewIncludeTypes().contains(ReviewIncludeType.PRODUCTS)) {
                aVarD.f("Stats", STATS_REVIEWS);
            }
            aVarD.f(kINCLUDE, StringUtils.componentsSeparatedBy(storeReviewsRequest.getReviewIncludeTypes(), ","));
        }
        if (!storeReviewsRequest.getSorts().isEmpty()) {
            aVarD.f(kSORT, StringUtils.componentsSeparatedBy(storeReviewsRequest.getSorts(), ","));
        }
        if (storeReviewsRequest.getSearchPhrase() != null) {
            aVarD.f(kSEARCH, storeReviewsRequest.getSearchPhrase());
        }
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar2 = new Headers.a();
        addCommonHeaders(aVar2, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar2.f()).b();
    }

    private Request createFromUserAuthenticationStringRequest(UserAuthenticationStringRequest userAuthenticationStringRequest) {
        Request.a aVar = new Request.a();
        HttpUrl httpUrlG = HttpUrl.m(this.bvRootApiUrl).k().d(AUTHENTICATE_USER_ENDPOINT).g();
        h.a aVar2 = new h.a();
        formPutSafe(aVar2, kAPI_VERSION, API_VERSION);
        formPutSafe(aVar2, kPASS_KEY, this.convApiKey);
        formPutSafe(aVar2, KEY_AUTH_TOKEN, userAuthenticationStringRequest.getAuthToken());
        formPutSafe(aVar2, kAPP_ID, this.bvMobileInfo.getMobileAppIdentifier());
        formPutSafe(aVar2, kAPP_VERSION, this.bvMobileInfo.getMobileAppVersion());
        formPutSafe(aVar2, kBUILD_NUM, this.bvMobileInfo.getMobileAppCode());
        formPutSafe(aVar2, kSDK_VERSION, this.bvMobileInfo.getBvSdkVersion());
        h hVarC = aVar2.c();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(hVarC).b();
    }

    private Request createFromVideoUploadRequest(VideoUploadRequest videoUploadRequest) {
        Request.a aVar = new Request.a();
        HttpUrl.a aVarD = HttpUrl.m(this.bvRootApiUrl).k().d(VIDEO_SUBMIT_ENDPOINT);
        k.a aVar2 = new k.a();
        VideoUpload videoUpload = videoUploadRequest.getVideoUpload();
        aVar2.f(k.f154406k).a(kAPI_VERSION, API_VERSION).a(kPASS_KEY, this.convApiKey).a("contenttype", videoUpload.getContentType().getKey()).b("video", "video.mp4", RequestBody.create(MEDIA_TYPE_VIDEO, videoUpload.getVideoFile()));
        k kVarE = aVar2.e();
        HttpUrl httpUrlG = aVarD.g();
        Headers.a aVar3 = new Headers.a();
        addCommonHeaders(aVar3, this.bvSdkUserAgent);
        return aVar.v(httpUrlG).n(aVar3.f()).p(kVarE).b();
    }

    private static void formPutSafe(h.a aVar, String str, Object obj) {
        if (obj == null || obj.toString().isEmpty()) {
            return;
        }
        aVar.a(str, String.valueOf(obj));
    }

    private String getContextDataValue(String str, String str2) {
        return String.format("%s:%s", String.format(Locale.US, KEY_CDV_TEMPLATE, str), str2);
    }

    private static void jsonPutSafe(m mVar, String str, Object obj) {
        if (obj == null || obj.toString().isEmpty()) {
            return;
        }
        mVar.r(str, String.valueOf(obj));
    }

    @Override // com.bazaarvoice.bvandroidsdk.RequestFactory
    public <RequestType extends ConversationsRequest> Request create(RequestType requesttype) {
        if (requesttype instanceof ReviewsRequest) {
            return createFromReviewRequest((ReviewsRequest) requesttype);
        }
        if (requesttype instanceof QuestionAndAnswerRequest) {
            return createFromQuestionAndAnswerRequest((QuestionAndAnswerRequest) requesttype);
        }
        if (requesttype instanceof ReviewHighlightsRequest) {
            return createFromReviewHighlightsRequest((ReviewHighlightsRequest) requesttype);
        }
        if (requesttype instanceof CommentsRequest) {
            return createFromCommentsRequest((CommentsRequest) requesttype);
        }
        if (requesttype instanceof AuthorsRequest) {
            return createFromAuthorsRequest((AuthorsRequest) requesttype);
        }
        if (requesttype instanceof BulkStoreRequest) {
            return createFromBulkStoreRequest((BulkStoreRequest) requesttype);
        }
        if (requesttype instanceof BulkRatingsRequest) {
            return createFromBulkRatingsRequest((BulkRatingsRequest) requesttype);
        }
        if (requesttype instanceof StoreReviewsRequest) {
            return createFromStoreReviewsRequest((StoreReviewsRequest) requesttype);
        }
        if (requesttype instanceof BulkProductRequest) {
            return createFromBulkProductRequest((BulkProductRequest) requesttype);
        }
        if (requesttype instanceof ProductDisplayPageRequest) {
            return createFromProductDisplayPageRequest((ProductDisplayPageRequest) requesttype);
        }
        if (requesttype instanceof FeaturesRequest) {
            return createFromFeaturesRequest((FeaturesRequest) requesttype);
        }
        if (requesttype instanceof ReviewSummaryRequest) {
            return createFromReivewSummaryRequest((ReviewSummaryRequest) requesttype);
        }
        if (requesttype instanceof FeedbackSubmissionRequest) {
            return createFromFeedbackSubmissionRequest((FeedbackSubmissionRequest) requesttype);
        }
        if (requesttype instanceof ReviewSubmissionRequest) {
            return createFromReviewSubmissionRequest((ReviewSubmissionRequest) requesttype);
        }
        if (requesttype instanceof StoreReviewSubmissionRequest) {
            return createFromStoreReviewSubmissionRequest((StoreReviewSubmissionRequest) requesttype);
        }
        if (requesttype instanceof QuestionSubmissionRequest) {
            return createFromQuestionSubmissionRequest((QuestionSubmissionRequest) requesttype);
        }
        if (requesttype instanceof AnswerSubmissionRequest) {
            return createFromAnswerSubmissionRequest((AnswerSubmissionRequest) requesttype);
        }
        if (requesttype instanceof CommentSubmissionRequest) {
            return createFromCommentSubmissionRequest((CommentSubmissionRequest) requesttype);
        }
        if (requesttype instanceof PhotoUploadRequest) {
            return createFromPhotoUploadRequest((PhotoUploadRequest) requesttype);
        }
        if (requesttype instanceof VideoUploadRequest) {
            return createFromVideoUploadRequest((VideoUploadRequest) requesttype);
        }
        if (requesttype instanceof UserAuthenticationStringRequest) {
            return createFromUserAuthenticationStringRequest((UserAuthenticationStringRequest) requesttype);
        }
        if (requesttype instanceof InitiateSubmitRequest) {
            return createFromInitiateSubmitRequest((InitiateSubmitRequest) requesttype);
        }
        if (requesttype instanceof ProgressiveSubmitRequest) {
            return createFromProgressiveSubmitRequest((ProgressiveSubmitRequest) requesttype);
        }
        throw new IllegalStateException("Unknown request type: " + requesttype.getClass().getCanonicalName());
    }

    BasicRequestFactory(BVMobileInfo bVMobileInfo, BVRootApiUrls bVRootApiUrls, BVConfig bVConfig, String str, FingerprintProvider fingerprintProvider) {
        this.bvMobileInfo = bVMobileInfo;
        this.bvRootApiUrl = bVRootApiUrls.getBazaarvoiceApiRootUrl();
        this.bvReviewHighlightsUrl = bVRootApiUrls.getBazaarvoiceReviewHighlightApiUrl();
        this.convApiKey = bVConfig.getApiKeyConversations();
        this.storeApiKey = bVConfig.getApiKeyConversationsStores();
        this.progressiveSubmissionApiKey = bVConfig.getApiKeyProgressiveSubmission();
        this.bvSdkUserAgent = str;
        this.fingerprintProvider = fingerprintProvider;
    }

    private static void addCommonDisplayQueryParams(HttpUrl.a aVar, ConversationsDisplayRequest conversationsDisplayRequest) {
        addFilterQueryParams(aVar, conversationsDisplayRequest.getFilters());
        addExtraQueryParams(aVar, conversationsDisplayRequest.getExtraParams());
        addProductSortParam(aVar, conversationsDisplayRequest.getSorts());
    }

    private static void addExtraQueryParams(HttpUrl.a aVar, List<ConversationsDisplayRequest.QueryPair> list) {
        for (ConversationsDisplayRequest.QueryPair queryPair : list) {
            if (queryPair.getKey() != null && queryPair.getValue() != null) {
                aVar.f(queryPair.getKey(), queryPair.getValue());
            }
        }
    }

    private static void addFilertableProductParams(HttpUrl.a aVar, SortableProductRequest sortableProductRequest) {
        if (!sortableProductRequest.getReviewFilter().isEmpty()) {
            Iterator<Filter> it = sortableProductRequest.getReviewFilter().iterator();
            while (it.hasNext()) {
                aVar.b(kFILTER_REVIEW, it.next().toString());
            }
        }
        if (!sortableProductRequest.getQuestionFilter().isEmpty()) {
            Iterator<Filter> it2 = sortableProductRequest.getQuestionFilter().iterator();
            while (it2.hasNext()) {
                aVar.b(kFILTER_QUESTIONS, it2.next().toString());
            }
        }
        if (!sortableProductRequest.getAuthorFilter().isEmpty()) {
            Iterator<Filter> it3 = sortableProductRequest.getAuthorFilter().iterator();
            while (it3.hasNext()) {
                aVar.b(kFILTER_AUTHORS, it3.next().toString());
            }
        }
        if (!sortableProductRequest.getCommentFilter().isEmpty()) {
            Iterator<Filter> it4 = sortableProductRequest.getCommentFilter().iterator();
            while (it4.hasNext()) {
                aVar.b(kFILTER_COMMENTS, it4.next().toString());
            }
        }
    }

    private static void addFilterQueryParams(HttpUrl.a aVar, List<Filter> list) {
        Iterator<Filter> it = list.iterator();
        while (it.hasNext()) {
            aVar.b(kFILTER, it.next().toString());
        }
    }

    private static void addProductSortParam(HttpUrl.a aVar, List<Sort> list) {
        Iterator<Sort> it = list.iterator();
        while (it.hasNext()) {
            aVar.b(kSORT, it.next().toString());
        }
    }

    private static void addSortableProductParams(HttpUrl.a aVar, SortableProductRequest sortableProductRequest) {
        if (!sortableProductRequest.getReviewSorts().isEmpty()) {
            aVar.f(kSORT_REVIEW, StringUtils.componentsSeparatedBy(sortableProductRequest.getReviewSorts(), ","));
        }
        if (!sortableProductRequest.getQuestionSorts().isEmpty()) {
            aVar.f(kSORT_QUESTIONS, StringUtils.componentsSeparatedBy(sortableProductRequest.getQuestionSorts(), ","));
        }
        if (!sortableProductRequest.getAnswerSorts().isEmpty()) {
            aVar.f(kSORT_ANSWERS, StringUtils.componentsSeparatedBy(sortableProductRequest.getAnswerSorts(), ","));
        }
        if (!sortableProductRequest.getIncludes().isEmpty()) {
            aVar.f(kINCLUDE, StringUtils.componentsSeparatedBy(sortableProductRequest.getIncludes(), ","));
        }
        for (Include include : sortableProductRequest.getIncludes()) {
            aVar.f(include.getLimitParamKey(), String.valueOf(include.getLimit()));
        }
        if (!sortableProductRequest.getStatistics().isEmpty()) {
            aVar.f("Stats", StringUtils.componentsSeparatedBy(sortableProductRequest.getStatistics(), ","));
        }
    }

    private static void addSubmissionPhotosFormParams(h.a aVar, ConversationsSubmissionRequest conversationsSubmissionRequest) {
        List<Photo> photos = conversationsSubmissionRequest.getPhotos();
        if (photos != null) {
            int i10 = 0;
            for (Photo photo : photos) {
                Locale locale = Locale.US;
                String str = String.format(locale, KEY_PHOTO_URL_TEMPLATE, Integer.valueOf(i10));
                String str2 = String.format(locale, KEY_PHOTO_CAPTION_TEMPLATE, Integer.valueOf(i10));
                formPutSafe(aVar, str, photo.getContent().getNormalUrl());
                formPutSafe(aVar, str2, photo.getCaption());
                i10++;
            }
        }
    }

    private static void addSubmissionVideosFormParams(h.a aVar, ConversationsSubmissionRequest conversationsSubmissionRequest) {
        List<Video> videos = conversationsSubmissionRequest.getVideos();
        if (videos != null) {
            int i10 = 0;
            for (Video video : videos) {
                Locale locale = Locale.US;
                String str = String.format(locale, KEY_VIDEO_URL_TEMPLATE, Integer.valueOf(i10));
                String str2 = String.format(locale, KEY_VIDEO_CAPTION_TEMPLATE, Integer.valueOf(i10));
                formPutSafe(aVar, str, video.getContent().getNormalUrl());
                formPutSafe(aVar, str2, video.getCaption());
                i10++;
            }
        }
    }

    private static Action getAction(ConversationsSubmissionRequest conversationsSubmissionRequest) {
        if (conversationsSubmissionRequest.isForcePreview()) {
            return Action.Preview;
        }
        return conversationsSubmissionRequest.getAction();
    }
}
