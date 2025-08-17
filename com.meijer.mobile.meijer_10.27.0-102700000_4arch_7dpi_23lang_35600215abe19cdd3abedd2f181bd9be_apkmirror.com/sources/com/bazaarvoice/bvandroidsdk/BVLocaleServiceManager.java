package com.bazaarvoice.bvandroidsdk;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class BVLocaleServiceManager {
    private static final String ANALYTICS_ROOT_URL_DEFAULT_PRODUCTION = "https://network.bazaarvoice.com/";
    private static final String ANALYTICS_ROOT_URL_DEFAULT_STAGING = "https://network-stg.bazaarvoice.com/";
    private static final String ANALYTICS_ROOT_URL_EU_PRODUCTION = "https://network-eu.bazaarvoice.com/";
    private static final String ANALYTICS_ROOT_URL_EU_STAGING = "https://network-eu-stg.bazaarvoice.com/";
    private static final BVLocaleServiceManager singleton = new BVLocaleServiceManager();
    private static final Map<ServiceConfiguration, String> analyticDefaultServiceMap = createDefaultServiceMap();
    private static final Map<ServiceConfiguration, String> analyticEUServiceMap = createEUServiceMap();
    private static final Map<ServiceType, Map<ServiceConfiguration, String>> analyticServiceMap = createAnalyticServiceMap();
    private static final Map<String, ServiceType> analyticMap = createAnalyticMap();

    public enum Service {
        ANALYTICS
    }

    private enum ServiceConfiguration {
        PRODUCTION,
        STAGING
    }

    private enum ServiceType {
        DEFAULT,
        EU
    }

    private static Map<String, ServiceType> createAnalyticMap() {
        return new HashMap<String, ServiceType>() { // from class: com.bazaarvoice.bvandroidsdk.BVLocaleServiceManager.4
            {
                ServiceType serviceType = ServiceType.EU;
                put("AT", serviceType);
                put("040", serviceType);
                put("BE", serviceType);
                put("056", serviceType);
                put("BG", serviceType);
                put("100", serviceType);
                put("CH", serviceType);
                put("756", serviceType);
                put("CY", serviceType);
                put("196", serviceType);
                put("CZ", serviceType);
                put("203", serviceType);
                put("DE", serviceType);
                put("276", serviceType);
                put("DK", serviceType);
                put("208", serviceType);
                put("ES", serviceType);
                put("724", serviceType);
                put("EE", serviceType);
                put("233", serviceType);
                put("FI", serviceType);
                put("246", serviceType);
                put("FR", serviceType);
                put("250", serviceType);
                put("GB", serviceType);
                put("826", serviceType);
                put("GR", serviceType);
                put("300", serviceType);
                put("HR", serviceType);
                put("191", serviceType);
                put("HU", serviceType);
                put("348", serviceType);
                put("IE", serviceType);
                put("372", serviceType);
                put("IS", serviceType);
                put("352", serviceType);
                put("IT", serviceType);
                put("380", serviceType);
                put("LI", serviceType);
                put("438", serviceType);
                put("LT", serviceType);
                put("440", serviceType);
                put("LU", serviceType);
                put("442", serviceType);
                put("LV", serviceType);
                put("428", serviceType);
                put("MT", serviceType);
                put("470", serviceType);
                put("NL", serviceType);
                put("528", serviceType);
                put("NO", serviceType);
                put("578", serviceType);
                put("PL", serviceType);
                put("616", serviceType);
                put("PT", serviceType);
                put("620", serviceType);
                put("RO", serviceType);
                put("642", serviceType);
                put("SE", serviceType);
                put("752", serviceType);
                put("SI", serviceType);
                put("705", serviceType);
                put("SK", serviceType);
                put("703", serviceType);
            }
        };
    }

    private static Map<ServiceType, Map<ServiceConfiguration, String>> createAnalyticServiceMap() {
        return new HashMap<ServiceType, Map<ServiceConfiguration, String>>() { // from class: com.bazaarvoice.bvandroidsdk.BVLocaleServiceManager.3
            {
                put(ServiceType.DEFAULT, BVLocaleServiceManager.analyticDefaultServiceMap);
                put(ServiceType.EU, BVLocaleServiceManager.analyticEUServiceMap);
            }
        };
    }

    private static Map<ServiceConfiguration, String> createDefaultServiceMap() {
        return new HashMap<ServiceConfiguration, String>() { // from class: com.bazaarvoice.bvandroidsdk.BVLocaleServiceManager.1
            {
                put(ServiceConfiguration.PRODUCTION, BVLocaleServiceManager.ANALYTICS_ROOT_URL_DEFAULT_PRODUCTION);
                put(ServiceConfiguration.STAGING, BVLocaleServiceManager.ANALYTICS_ROOT_URL_DEFAULT_STAGING);
            }
        };
    }

    private static Map<ServiceConfiguration, String> createEUServiceMap() {
        return new HashMap<ServiceConfiguration, String>() { // from class: com.bazaarvoice.bvandroidsdk.BVLocaleServiceManager.2
            {
                put(ServiceConfiguration.PRODUCTION, BVLocaleServiceManager.ANALYTICS_ROOT_URL_EU_PRODUCTION);
                put(ServiceConfiguration.STAGING, BVLocaleServiceManager.ANALYTICS_ROOT_URL_EU_STAGING);
            }
        };
    }

    public static BVLocaleServiceManager getInstance() {
        return singleton;
    }

    private String resourceForAnalytics(Locale locale, boolean z10) {
        ServiceConfiguration serviceConfiguration = z10 ? ServiceConfiguration.STAGING : ServiceConfiguration.PRODUCTION;
        Map<String, ServiceType> map = analyticMap;
        ServiceType serviceType = map.containsKey(locale.getCountry()) ? map.get(locale.getCountry()) : ServiceType.DEFAULT;
        Map<ServiceType, Map<ServiceConfiguration, String>> map2 = analyticServiceMap;
        Map<ServiceConfiguration, String> map3 = map2.get(serviceType) != null ? map2.get(serviceType) : analyticDefaultServiceMap;
        return map3.get(serviceConfiguration) != null ? map3.get(serviceConfiguration) : ANALYTICS_ROOT_URL_DEFAULT_STAGING;
    }

    private BVLocaleServiceManager() {
    }

    public String resourceFor(Service service, Locale locale, boolean z10) throws IllegalArgumentException {
        if (service.ordinal() == 0) {
            return resourceForAnalytics(locale, z10);
        }
        throw new IllegalArgumentException("No service exists for locale resource.");
    }
}
