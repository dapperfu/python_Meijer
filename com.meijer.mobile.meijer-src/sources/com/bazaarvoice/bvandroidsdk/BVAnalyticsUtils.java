package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
class BVAnalyticsUtils {
    private static final String BV_SHARED_PREFS_FILE_NAME = "_bazaarvoice_shared_prefs_";
    private static final String BV_SHARED_PREFS_KEY_UUID = "_bazaarvoice_shared_prefs_key_uuid_";
    private static final String TAG = "BVAnalyticsUtils";
    static final String THREAD_PREFIX = "BVAnalytics-";
    private static DecimalFormat twoPlaceFormat = new DecimalFormat("0.00");
    static final List<String> NON_PII_PARAMS = Arrays.asList("orderId", "affiliation", "total", "tax", "shipping", "city", "state", "currency", "items", "locale", "type", "label", "value", "partnerSource", "TestCase", "TestSession", "dc", "ref", "deploymentZone", "discount", PlaceTypes.COUNTRY, "proxy");

    static void mapPutSafe(Map<String, Object> map, String str, Object obj) {
        if (str == null || str.isEmpty() || obj == null || obj.toString().isEmpty()) {
            return;
        }
        map.put(str, obj.toString());
    }

    static String generateLoadId() {
        StringBuilder sb2 = new StringBuilder(20);
        while (sb2.length() < 20) {
            sb2.append(Integer.toHexString((int) (Math.random() * 16.0d)));
        }
        return sb2.toString();
    }

    static UUID getUuid(Context context) {
        if (context == null) {
            return UUID.randomUUID();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(BV_SHARED_PREFS_FILE_NAME, 0);
        String string = sharedPreferences.getString(BV_SHARED_PREFS_KEY_UUID, "");
        if (!string.isEmpty()) {
            return UUID.fromString(string);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        sharedPreferences.edit().putString(BV_SHARED_PREFS_KEY_UUID, uuidRandomUUID.toString()).apply();
        return uuidRandomUUID;
    }

    static boolean isPiiParam(String str) {
        return !NON_PII_PARAMS.contains(str);
    }

    static void mapPutAllSafe(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            if (entry.getValue() instanceof List) {
                mapPutSafe(map, entry.getKey(), (List<Map<String, Object>>) entry.getValue());
            } else {
                mapPutSafe(map, entry.getKey(), entry.getValue());
            }
        }
    }

    public static Map<String, Object> nonPiiOnly(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!isPiiParam(entry.getKey())) {
                mapPutSafe(map2, entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    static void warnShouldNotBeEmpty(String str, Object obj) {
        if (obj == null) {
            FS.log_e("BVAnalytics", str + " must not be empty");
        }
    }

    BVAnalyticsUtils() {
    }

    static void addPiiOnly(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            if (isPiiParam(entry.getKey())) {
                mapPutSafe(map, entry.getKey(), entry.getValue());
            }
        }
    }

    static String getPackageName(Context context) {
        return context.getPackageName();
    }

    static String getVersionCode(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    static String getVersionName(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    static void mapPutSafe(Map<String, Object> map, String str, List<Map<String, Object>> list) {
        if (str == null || str.isEmpty() || list == null || list.isEmpty()) {
            return;
        }
        map.put(str, list);
    }

    static void mapPutSafe(Map<String, Object> map, String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            return;
        }
        map.put(str, str2);
    }

    static void mapPutSafe(Map<String, Object> map, String str, int i10) {
        if (str == null || str.isEmpty()) {
            return;
        }
        map.put(str, String.valueOf(i10));
    }

    static void mapPutSafe(Map<String, Object> map, String str, boolean z10) {
        if (str == null || str.isEmpty()) {
            return;
        }
        map.put(str, String.valueOf(z10));
    }

    static void mapPutSafe(Map<String, Object> map, String str, double d10) {
        if (str == null || str.isEmpty()) {
            return;
        }
        map.put(str, String.valueOf(d10));
    }

    static void mapPutSafe(Map<String, Object> map, String str, long j10) {
        if (str == null || str.isEmpty()) {
            return;
        }
        map.put(str, String.valueOf(j10));
    }
}
