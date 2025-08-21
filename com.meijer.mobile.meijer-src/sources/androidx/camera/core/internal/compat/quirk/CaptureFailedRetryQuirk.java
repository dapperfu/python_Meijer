package androidx.camera.core.internal.compat.quirk;

import F.g0;
import android.os.Build;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class CaptureFailedRetryQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Pair<String, String>> f47747a = new HashSet(Collections.singletonList(Pair.create("SAMSUNG", "SM-G981U1")));

    public int c() {
        return 1;
    }

    static boolean d() {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return f47747a.contains(Pair.create(str.toUpperCase(locale), Build.MODEL.toUpperCase(locale)));
    }
}
