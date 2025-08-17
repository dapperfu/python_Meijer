package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f47234a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro");

    static boolean c() {
        return f47234a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
