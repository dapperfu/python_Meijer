package C8;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import g8.x;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3734a = x.f133195a + "DisplayMetricsUtility";

    @Deprecated
    public static Point a(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @Deprecated
    public static DisplayMetrics b(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
