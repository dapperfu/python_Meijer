package ye;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f171378a = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: b, reason: collision with root package name */
    private static final Map f171379b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final ze.i f171380c = new ze.i("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map mapB = b();
        bundle.putInt("playcore_version_code", ((Integer) mapB.get("java")).intValue());
        if (mapB.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) mapB.get("native")).intValue());
        }
        if (mapB.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) mapB.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        map = f171379b;
        map.put("java", 11004);
        return map;
    }
}
