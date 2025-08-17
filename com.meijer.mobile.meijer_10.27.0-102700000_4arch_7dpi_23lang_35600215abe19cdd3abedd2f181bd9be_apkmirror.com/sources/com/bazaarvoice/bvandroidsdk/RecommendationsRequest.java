package com.bazaarvoice.bvandroidsdk;

import com.medallia.digital.mobilesdk.q2;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public class RecommendationsRequest {
    private static final int MAX_LIMIT = 100;
    private static final int MIN_LIMIT = 1;
    private static final String RECOMMENDATIONS_PATH = "recommendations";
    private String categoryId;
    private List<String> interests;
    private int limit;
    private double minAvgRating;
    private PageType pageType;
    private String productId;
    private String requiredCategory;

    public static final class Builder {
        private String categoryId;
        private List<String> interest;
        private int limit;
        private double minAvgRating;
        private PageType pageType;
        private String productId;
        private String requiredCategory;

        public RecommendationsRequest build() {
            return new RecommendationsRequest(this);
        }

        public Builder categoryId(String str) {
            if (this.productId != null) {
                throw new IllegalArgumentException("Can only send productId or categoryId, not both");
            }
            this.categoryId = str;
            return this;
        }

        public Builder interests(List<String> list) {
            this.interest = list;
            return this;
        }

        public Builder minAvgRating(double d10) {
            this.minAvgRating = d10;
            return this;
        }

        public Builder pageType(PageType pageType) {
            this.pageType = pageType;
            return this;
        }

        public Builder productId(String str) {
            if (this.categoryId != null) {
                throw new IllegalArgumentException("Can only send productId or categoryId, not both");
            }
            this.productId = str;
            return this;
        }

        public Builder requiredCategory(String str) {
            this.requiredCategory = str;
            return this;
        }

        public Builder(int i10) {
            this.limit = i10;
            if (i10 >= 1 && i10 <= 100) {
            } else {
                throw new IllegalArgumentException("Limit must be in the range [1, 100]");
            }
        }
    }

    private RecommendationsRequest(Builder builder) {
        this.limit = builder.limit;
        this.productId = builder.productId;
        this.categoryId = builder.categoryId;
        this.pageType = builder.pageType;
        this.interests = builder.interest;
        this.requiredCategory = builder.requiredCategory;
        this.minAvgRating = builder.minAvgRating;
    }

    private static String buildListsQueryParam(List<String> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return StringUtils.componentsSeparatedBy(list, ",");
    }

    private static String generateSimilarityParams(String str, String str2, String str3) {
        if (str != null) {
            return "&product=" + str3 + q2.f92724c + str;
        }
        if (str2 == null) {
            return "";
        }
        return "&category=" + str3 + q2.f92724c + str2;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public int getLimit() {
        return this.limit;
    }

    public PageType getPageType() {
        return this.pageType;
    }

    public String getProductId() {
        return this.productId;
    }

    static String toUrlString(BVSDK bvsdk, String str, RecommendationsRequest recommendationsRequest) {
        String shopperMarketingApiRootUrl = bvsdk.getBvWorkerData().getRootApiUrls().getShopperMarketingApiRootUrl();
        BVUserProvidedData bvUserProvidedData = bvsdk.getBvUserProvidedData();
        String apiKeyShopperAdvertising = bvUserProvidedData.getBvConfig().getApiKeyShopperAdvertising();
        String clientId = bvUserProvidedData.getBvConfig().getClientId();
        String strGenerateSimilarityParams = generateSimilarityParams(recommendationsRequest.getProductId(), recommendationsRequest.getCategoryId(), clientId);
        String strBuildListsQueryParam = buildListsQueryParam(recommendationsRequest.interests);
        HttpUrl httpUrlM = HttpUrl.m(shopperMarketingApiRootUrl);
        if (httpUrlM != null) {
            HttpUrl.a aVarK = httpUrlM.k();
            aVarK.c(RECOMMENDATIONS_PATH).c("magpie_idfa_" + str).b("passKey", apiKeyShopperAdvertising).b("client", clientId).b("min_avg_rating", String.valueOf(recommendationsRequest.minAvgRating)).b("limit", String.valueOf(recommendationsRequest.limit));
            PageType pageType = recommendationsRequest.pageType;
            if (pageType != null) {
                aVarK.b("pageType", pageType.toString());
            }
            String str2 = recommendationsRequest.requiredCategory;
            if (str2 != null) {
                aVarK.b("required_category", str2);
            }
            if (recommendationsRequest.interests != null) {
                aVarK.b("interests", strBuildListsQueryParam);
            }
            return aVarK.g().getUrl() + strGenerateSimilarityParams;
        }
        return null;
    }
}
