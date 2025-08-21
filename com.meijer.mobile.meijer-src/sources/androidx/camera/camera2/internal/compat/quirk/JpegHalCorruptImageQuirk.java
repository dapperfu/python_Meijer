package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import w.B;

/* loaded from: classes.dex */
public final class JpegHalCorruptImageQuirk implements SoftwareJpegEncodingPreferredQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f47452a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo", "k61v1_basic_ref"));

    static boolean c(B b10) {
        return f47452a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
