package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;
import kw.w;

/* loaded from: classes4.dex */
public final class BVConfig {
    private Locale analyticsDefaultLocale;
    private final String apiKeyConversations;
    private final String apiKeyConversationsStores;
    private final String apiKeyCurations;
    private final String apiKeyLocation;
    private String apiKeyProductSentiments;
    private final String apiKeyProgressiveSubmission;
    private final String apiKeyShopperAdvertising;
    private final String clientId;
    private final boolean dryRunAnalytics;

    static class BVConfigDeserializer implements j<BVConfig> {
        private static final String ANALYTICS_LOCALE_IDENTIFIER = "analyticsLocaleIdentifier";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.j
        public BVConfig deserialize(k kVar, Type type, i iVar) throws JsonParseException {
            String strH;
            BVConfig bVConfig = (BVConfig) new Gson().h(kVar.e(), BVConfig.class);
            try {
                k kVarT = kVar.e().t(ANALYTICS_LOCALE_IDENTIFIER);
                if (kVarT == null || (strH = kVarT.h()) == null) {
                    return bVConfig;
                }
                bVConfig.analyticsDefaultLocale = new Locale("", strH.toUpperCase());
                return bVConfig;
            } catch (IllegalArgumentException e10) {
                throw new RuntimeException("Failed to create default Locale from configuration file " + e10);
            }
        }

        BVConfigDeserializer() {
        }
    }

    static class BVConfigUtil {
        private static final String PROD_FILE_NAME = "bvsdk_config_prod.json";
        private static final String STAGING_FILE_NAME = "bvsdk_config_staging.json";

        static BVConfig getBvConfig(Context context, BazaarEnvironment bazaarEnvironment) {
            String fileName = getFileName(bazaarEnvironment);
            try {
                String strN3 = w.d(w.k(context.getAssets().open(fileName))).n3();
                f fVar = new f();
                fVar.d(BVConfig.class, new BVConfigDeserializer());
                return (BVConfig) fVar.b().o(strN3, BVConfig.class);
            } catch (JsonSyntaxException e10) {
                throw new RuntimeException("Failed to parse configuration file " + fileName, e10);
            } catch (IOException e11) {
                throw new RuntimeException("Failed to find configuration file " + fileName, e11);
            }
        }

        private static String getFileName(BazaarEnvironment bazaarEnvironment) {
            return bazaarEnvironment == BazaarEnvironment.STAGING ? STAGING_FILE_NAME : PROD_FILE_NAME;
        }

        BVConfigUtil() {
        }
    }

    public static class Builder {
        private Locale analyticsDefaultLocale;
        private String apiKeyConversations;
        private String apiKeyConversationsStores;
        private String apiKeyCurations;
        private String apiKeyLocation;
        private String apiKeyProductSentiments;
        private String apiKeyProgressiveSubmission;
        private String apiKeyShopperAdvertising;
        private String clientId;
        private boolean dryRunAnalytics;

        public Builder() {
            this.dryRunAnalytics = false;
        }

        public Builder analyticsDefaultLocale(Locale locale) {
            this.analyticsDefaultLocale = locale;
            return this;
        }

        public Builder apiKeyConversations(String str) {
            this.apiKeyConversations = str;
            return this;
        }

        public Builder apiKeyConversationsStores(String str) {
            this.apiKeyConversationsStores = str;
            return this;
        }

        public Builder apiKeyCurations(String str) {
            this.apiKeyCurations = str;
            return this;
        }

        public Builder apiKeyLocation(String str) {
            this.apiKeyLocation = str;
            return this;
        }

        public Builder apiKeyProductSentiments(String str) {
            this.apiKeyProductSentiments = str;
            return this;
        }

        public Builder apiKeyProgressiveSubmission(String str) {
            this.apiKeyProgressiveSubmission = str;
            return this;
        }

        public Builder apiKeyShopperAdvertising(String str) {
            this.apiKeyShopperAdvertising = str;
            return this;
        }

        public BVConfig build() {
            return new BVConfig(this);
        }

        public Builder clientId(String str) {
            this.clientId = str;
            return this;
        }

        public Builder dryRunAnalytics(boolean z10) {
            this.dryRunAnalytics = z10;
            return this;
        }

        private Builder(BVConfig bVConfig) {
            this.dryRunAnalytics = false;
            this.analyticsDefaultLocale = bVConfig.analyticsDefaultLocale;
            this.apiKeyConversations = bVConfig.apiKeyConversations;
            this.apiKeyProductSentiments = bVConfig.apiKeyProductSentiments;
            this.apiKeyConversationsStores = bVConfig.apiKeyConversationsStores;
            this.apiKeyCurations = bVConfig.apiKeyCurations;
            this.apiKeyLocation = bVConfig.apiKeyLocation;
            this.apiKeyShopperAdvertising = bVConfig.apiKeyShopperAdvertising;
            this.clientId = bVConfig.clientId;
            this.dryRunAnalytics = bVConfig.dryRunAnalytics;
            this.apiKeyProgressiveSubmission = bVConfig.apiKeyProgressiveSubmission;
        }
    }

    Locale getAnalyticsDefaultLocale() {
        return this.analyticsDefaultLocale;
    }

    String getApiKeyConversations() {
        return this.apiKeyConversations;
    }

    String getApiKeyConversationsStores() {
        return this.apiKeyConversationsStores;
    }

    String getApiKeyCurations() {
        return this.apiKeyCurations;
    }

    String getApiKeyLocation() {
        return this.apiKeyLocation;
    }

    public String getApiKeyProductSentiments() {
        return this.apiKeyProductSentiments;
    }

    String getApiKeyProgressiveSubmission() {
        return this.apiKeyProgressiveSubmission;
    }

    String getApiKeyShopperAdvertising() {
        return this.apiKeyShopperAdvertising;
    }

    String getClientId() {
        return this.clientId;
    }

    boolean isDryRunAnalytics() {
        return this.dryRunAnalytics;
    }

    Builder newBuilder() {
        return new Builder();
    }

    BVConfig(Builder builder) {
        this.analyticsDefaultLocale = builder.analyticsDefaultLocale;
        this.apiKeyConversations = builder.apiKeyConversations;
        this.apiKeyProductSentiments = builder.apiKeyProductSentiments;
        this.apiKeyConversationsStores = builder.apiKeyConversationsStores;
        this.apiKeyCurations = builder.apiKeyCurations;
        this.apiKeyLocation = builder.apiKeyLocation;
        this.apiKeyShopperAdvertising = builder.apiKeyShopperAdvertising;
        this.apiKeyProgressiveSubmission = builder.apiKeyProgressiveSubmission;
        this.clientId = builder.clientId;
        this.dryRunAnalytics = builder.dryRunAnalytics;
    }
}
