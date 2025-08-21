package fsimpl;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes15.dex */
public class fC {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f133456a;

    public static DisplayMetrics a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        f133456a.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static synchronized void a(WindowManager windowManager) {
        f133456a = windowManager;
    }
}
