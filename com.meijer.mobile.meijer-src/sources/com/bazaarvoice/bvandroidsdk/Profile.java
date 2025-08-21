package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class Profile {
    private static final String TARGETING_KEY_BRANDS = "brands";
    private static final String TARGETING_KEY_INTERESTS = "interests";
    private Map<String, Interest> brands;
    private Map<String, Interest> interests;
    private String plan;
    private Map<String, BVProduct> products;
    private RecommendationStats recommendationStats;
    private List<String> recommendations;

    private boolean canGetRecommendedProducts() {
        Map<String, BVProduct> map;
        return (this.recommendations == null || (map = this.products) == null || map.isEmpty()) ? false : true;
    }

    private String getFlattenedValue(Map<String, Interest> map) {
        StringBuilder sb2 = new StringBuilder();
        int size = map.size();
        int i10 = 0;
        for (Map.Entry<String, Interest> entry : map.entrySet()) {
            String key = entry.getKey();
            Interest value = entry.getValue();
            if (key != null && !key.isEmpty() && value != null && value.getValue() != null && !value.getValue().isEmpty()) {
                String value2 = value.getValue();
                sb2.append(key);
                sb2.append("_");
                sb2.append(value2);
                int i11 = i10 + 1;
                if (i10 != size - 1) {
                    sb2.append(" ");
                }
                i10 = i11;
            }
        }
        return sb2.toString();
    }

    private boolean shouldFlattenKeywords(Map<String, Interest> map) {
        return map != null && map.size() > 0;
    }

    Map<String, Interest> getBrands() {
        return this.brands;
    }

    Map<String, Interest> getInterests() {
        return this.interests;
    }

    public String getPlan() {
        return this.plan;
    }

    public RecommendationStats getRecommendationStats() {
        return this.recommendationStats;
    }

    public List<BVProduct> getRecommendedProducts() {
        ArrayList arrayList = new ArrayList();
        if (canGetRecommendedProducts()) {
            for (Map.Entry<String, BVProduct> entry : this.products.entrySet()) {
                if (this.recommendations.contains(entry.getKey())) {
                    entry.getValue().mergeRecommendationStats(this.recommendationStats);
                    arrayList.add(entry.getValue());
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> getTargetingKeywords() {
        HashMap map = new HashMap();
        if (shouldFlattenKeywords(getInterests())) {
            map.put(TARGETING_KEY_INTERESTS, getFlattenedValue(getInterests()));
        }
        if (shouldFlattenKeywords(getBrands())) {
            map.put(TARGETING_KEY_BRANDS, getFlattenedValue(getBrands()));
        }
        return map;
    }

    public String toString() {
        return "Profile{interests=" + this.interests + ", brands=" + this.brands + ", recommendations=" + this.recommendations + ", recommendationStats=" + this.recommendationStats + ", products=" + this.products + '}';
    }
}
