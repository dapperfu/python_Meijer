package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import F.v0;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Range<Integer>> f47209a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f47210a;

        static {
            int[] iArr = new int[v0.b.values().length];
            f47210a = iArr;
            try {
                iArr[v0.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47210a[v0.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47210a[v0.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f47209a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    private static boolean d() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map<String, Range<Integer>> map = f47209a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range<Integer> range = map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range<Integer>) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    static boolean e() {
        return d();
    }

    public Size c(v0.b bVar) {
        if (!d()) {
            return null;
        }
        int i10 = a.f47210a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return new Size(3264, 1836);
            }
            return new Size(1280, 720);
        }
        return new Size(1920, 1080);
    }
}
