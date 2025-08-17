package k3;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {
    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(DrmSession drmSession) {
        Map<String, String> mapF = drmSession.f();
        if (mapF == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapF, "LicenseDurationRemaining")), Long.valueOf(a(mapF, "PlaybackDurationRemaining")));
    }
}
