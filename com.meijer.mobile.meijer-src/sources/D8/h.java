package D8;

import E8.a;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public class h implements E8.b {

    /* renamed from: a, reason: collision with root package name */
    static a f6034a = new a() { // from class: D8.g
        @Override // D8.h.a
        public final Display a(Activity activity) {
            return h.b(activity);
        }
    };

    @FunctionalInterface
    interface a {
        Display a(Activity activity);
    }

    private static boolean d(int i10, int i11) {
        if (i11 == 2) {
            return i10 == 0 || i10 == 2;
        }
        if (i11 == 1) {
            return i10 == 1 || i10 == 3;
        }
        return false;
    }

    public static /* synthetic */ Display b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return activity.getDisplay();
        }
        return null;
    }

    @Deprecated(since = "Android API level 30")
    public static E8.a c(Display display, int i10) {
        a.b bVar = new a.b();
        DisplayMetrics displayMetricsB = E8.d.b(display);
        bVar.g(displayMetricsB.density);
        bVar.f(displayMetricsB.densityDpi);
        Point pointA = E8.d.a(display);
        if (d(display.getRotation(), i10)) {
            bVar.i(Math.max(pointA.x, pointA.y));
            bVar.h(Math.min(pointA.x, pointA.y));
        } else {
            bVar.i(Math.min(pointA.x, pointA.y));
            bVar.h(Math.max(pointA.x, pointA.y));
        }
        return bVar.e();
    }

    @Override // E8.b
    public E8.a a(Activity activity) {
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        Configuration configuration = activity.getResources().getConfiguration();
        int i10 = configuration.orientation;
        if (Build.VERSION.SDK_INT <= 29) {
            return c(windowManager.getDefaultDisplay(), i10);
        }
        a.b bVar = new a.b();
        Display displayA = f6034a.a(activity);
        int rotation = displayA != null ? displayA.getRotation() : 0;
        Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
        if (d(rotation, i10)) {
            bVar.i(Math.max(bounds.width(), bounds.height()));
            bVar.h(Math.min(bounds.width(), bounds.height()));
        } else {
            bVar.i(Math.min(bounds.width(), bounds.height()));
            bVar.h(Math.max(bounds.width(), bounds.height()));
        }
        int i11 = configuration.densityDpi;
        bVar.g(i11 / 160.0f);
        bVar.f(i11);
        return bVar.e();
    }
}
