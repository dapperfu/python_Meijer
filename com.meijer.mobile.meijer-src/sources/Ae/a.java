package Ae;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f309a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f310b;

    static {
        HashMap map = new HashMap();
        f309a = map;
        HashMap map2 = new HashMap();
        f310b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i10) {
        Map map = f309a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f310b.get(numValueOf)) + ")";
    }
}
