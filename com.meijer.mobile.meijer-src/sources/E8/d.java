package E8;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import i8.x;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7046a = x.f137411a + "DisplayMetricsUtility";

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
