package ye;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ye.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18208a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f170460a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f170461b;

    static {
        HashMap map = new HashMap();
        f170460a = map;
        HashMap map2 = new HashMap();
        f170461b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i10) {
        Map map = f170460a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f170461b.get(numValueOf)) + ")";
    }
}
