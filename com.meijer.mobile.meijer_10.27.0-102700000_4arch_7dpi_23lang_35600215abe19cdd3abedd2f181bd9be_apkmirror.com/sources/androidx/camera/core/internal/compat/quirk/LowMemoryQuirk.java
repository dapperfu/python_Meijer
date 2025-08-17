package androidx.camera.core.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class LowMemoryQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f47527a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean c() {
        return f47527a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
